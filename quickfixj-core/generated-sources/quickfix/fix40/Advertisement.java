
package quickfix.fix40;

import quickfix.FieldNotFound;


public class Advertisement extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "7";
	

	public Advertisement() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Advertisement(quickfix.field.AdvId advId, quickfix.field.AdvTransType advTransType, quickfix.field.Symbol symbol, quickfix.field.AdvSide advSide, quickfix.field.Shares shares) {
		this();
		setField(advId);
		setField(advTransType);
		setField(symbol);
		setField(advSide);
		setField(shares);
	}
	
	public void set(quickfix.field.AdvId value) {
		setField(value);
	}

	public quickfix.field.AdvId get(quickfix.field.AdvId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AdvId getAdvId() throws FieldNotFound {
		return get(new quickfix.field.AdvId());
	}

	public boolean isSet(quickfix.field.AdvId field) {
		return isSetField(field);
	}

	public boolean isSetAdvId() {
		return isSetField(2);
	}

	public void set(quickfix.field.AdvTransType value) {
		setField(value);
	}

	public quickfix.field.AdvTransType get(quickfix.field.AdvTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AdvTransType getAdvTransType() throws FieldNotFound {
		return get(new quickfix.field.AdvTransType());
	}

	public boolean isSet(quickfix.field.AdvTransType field) {
		return isSetField(field);
	}

	public boolean isSetAdvTransType() {
		return isSetField(5);
	}

	public void set(quickfix.field.AdvRefID value) {
		setField(value);
	}

	public quickfix.field.AdvRefID get(quickfix.field.AdvRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AdvRefID getAdvRefID() throws FieldNotFound {
		return get(new quickfix.field.AdvRefID());
	}

	public boolean isSet(quickfix.field.AdvRefID field) {
		return isSetField(field);
	}

	public boolean isSetAdvRefID() {
		return isSetField(3);
	}

	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.SymbolSfx());
	}

	public boolean isSet(quickfix.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.field.SecurityID value) {
		setField(value);
	}

	public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.field.SecurityID());
	}

	public boolean isSet(quickfix.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.field.IDSource value) {
		setField(value);
	}

	public quickfix.field.IDSource get(quickfix.field.IDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDSource getIDSource() throws FieldNotFound {
		return get(new quickfix.field.IDSource());
	}

	public boolean isSet(quickfix.field.IDSource field) {
		return isSetField(field);
	}

	public boolean isSetIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.field.Issuer value) {
		setField(value);
	}

	public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.field.Issuer());
	}

	public boolean isSet(quickfix.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.SecurityDesc());
	}

	public boolean isSet(quickfix.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.field.AdvSide value) {
		setField(value);
	}

	public quickfix.field.AdvSide get(quickfix.field.AdvSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AdvSide getAdvSide() throws FieldNotFound {
		return get(new quickfix.field.AdvSide());
	}

	public boolean isSet(quickfix.field.AdvSide field) {
		return isSetField(field);
	}

	public boolean isSetAdvSide() {
		return isSetField(4);
	}

	public void set(quickfix.field.Shares value) {
		setField(value);
	}

	public quickfix.field.Shares get(quickfix.field.Shares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Shares getShares() throws FieldNotFound {
		return get(new quickfix.field.Shares());
	}

	public boolean isSet(quickfix.field.Shares field) {
		return isSetField(field);
	}

	public boolean isSetShares() {
		return isSetField(53);
	}

	public void set(quickfix.field.Price value) {
		setField(value);
	}

	public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.field.Price());
	}

	public boolean isSet(quickfix.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.field.Currency value) {
		setField(value);
	}

	public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.field.Currency());
	}

	public boolean isSet(quickfix.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.field.TransactTime value) {
		setField(value);
	}

	public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.field.TransactTime());
	}

	public boolean isSet(quickfix.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.field.Text value) {
		setField(value);
	}

	public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Text getText() throws FieldNotFound {
		return get(new quickfix.field.Text());
	}

	public boolean isSet(quickfix.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
