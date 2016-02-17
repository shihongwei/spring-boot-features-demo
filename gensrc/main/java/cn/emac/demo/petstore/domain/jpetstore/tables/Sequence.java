/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.jpetstore.tables;


import cn.emac.demo.petstore.domain.jpetstore.Jpetstore;
import cn.emac.demo.petstore.domain.jpetstore.Keys;
import cn.emac.demo.petstore.domain.jpetstore.tables.records.SequenceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Inventory
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequence extends TableImpl<SequenceRecord> {

	private static final long serialVersionUID = -1329655469;

	/**
	 * The reference instance of <code>jpetstore.sequence</code>
	 */
	public static final Sequence SEQUENCE = new Sequence();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SequenceRecord> getRecordType() {
		return SequenceRecord.class;
	}

	/**
	 * The column <code>jpetstore.sequence.name</code>.
	 */
	public final TableField<SequenceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>jpetstore.sequence.nextid</code>.
	 */
	public final TableField<SequenceRecord, Integer> NEXTID = createField("nextid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>jpetstore.sequence</code> table reference
	 */
	public Sequence() {
		this("sequence", null);
	}

	/**
	 * Create an aliased <code>jpetstore.sequence</code> table reference
	 */
	public Sequence(String alias) {
		this(alias, SEQUENCE);
	}

	private Sequence(String alias, Table<SequenceRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sequence(String alias, Table<SequenceRecord> aliased, Field<?>[] parameters) {
		super(alias, Jpetstore.JPETSTORE, aliased, parameters, "Inventory");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SequenceRecord> getPrimaryKey() {
		return Keys.KEY_SEQUENCE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SequenceRecord>> getKeys() {
		return Arrays.<UniqueKey<SequenceRecord>>asList(Keys.KEY_SEQUENCE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sequence as(String alias) {
		return new Sequence(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sequence rename(String name) {
		return new Sequence(name, null);
	}
}