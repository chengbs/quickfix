
package quickfix.fix50;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(quickfix.field.OrderID orderID, quickfix.field.ExecID execID, quickfix.field.ExecType execType, quickfix.field.OrdStatus ordStatus, quickfix.field.Side side, quickfix.field.LeavesQty leavesQty, quickfix.field.CumQty cumQty) {
		this();
		setField(orderID);
		setField(execID);
		setField(execType);
		setField(ordStatus);
		setField(side);
		setField(leavesQty);
		setField(cumQty);
	}
	
	public void set(quickfix.field.OrderID value) {
		setField(value);
	}

	public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.field.OrderID());
	}

	public boolean isSet(quickfix.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.field.SecondaryOrderID value) {
		setField(value);
	}

	public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryOrderID());
	}

	public boolean isSet(quickfix.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
	}

	public void set(quickfix.field.SecondaryClOrdID value) {
		setField(value);
	}

	public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryClOrdID());
	}

	public boolean isSet(quickfix.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(quickfix.field.SecondaryExecID value) {
		setField(value);
	}

	public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryExecID());
	}

	public boolean isSet(quickfix.field.SecondaryExecID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryExecID() {
		return isSetField(527);
	}

	public void set(quickfix.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdID());
	}

	public boolean isSet(quickfix.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.field.ClOrdLinkID value) {
		setField(value);
	}

	public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdLinkID());
	}

	public boolean isSet(quickfix.field.ClOrdLinkID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdLinkID() {
		return isSetField(583);
	}

	public void set(quickfix.field.QuoteRespID value) {
		setField(value);
	}

	public quickfix.field.QuoteRespID get(quickfix.field.QuoteRespID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteRespID getQuoteRespID() throws FieldNotFound {
		return get(new quickfix.field.QuoteRespID());
	}

	public boolean isSet(quickfix.field.QuoteRespID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteRespID() {
		return isSetField(693);
	}

	public void set(quickfix.field.OrdStatusReqID value) {
		setField(value);
	}

	public quickfix.field.OrdStatusReqID get(quickfix.field.OrdStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdStatusReqID getOrdStatusReqID() throws FieldNotFound {
		return get(new quickfix.field.OrdStatusReqID());
	}

	public boolean isSet(quickfix.field.OrdStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatusReqID() {
		return isSetField(790);
	}

	public void set(quickfix.field.MassStatusReqID value) {
		setField(value);
	}

	public quickfix.field.MassStatusReqID get(quickfix.field.MassStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MassStatusReqID getMassStatusReqID() throws FieldNotFound {
		return get(new quickfix.field.MassStatusReqID());
	}

	public boolean isSet(quickfix.field.MassStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetMassStatusReqID() {
		return isSetField(584);
	}

	public void set(quickfix.field.TotNumReports value) {
		setField(value);
	}

	public quickfix.field.TotNumReports get(quickfix.field.TotNumReports value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotNumReports getTotNumReports() throws FieldNotFound {
		return get(new quickfix.field.TotNumReports());
	}

	public boolean isSet(quickfix.field.TotNumReports field) {
		return isSetField(field);
	}

	public boolean isSetTotNumReports() {
		return isSetField(911);
	}

	public void set(quickfix.field.LastRptRequested value) {
		setField(value);
	}

	public quickfix.field.LastRptRequested get(quickfix.field.LastRptRequested value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastRptRequested getLastRptRequested() throws FieldNotFound {
		return get(new quickfix.field.LastRptRequested());
	}

	public boolean isSet(quickfix.field.LastRptRequested field) {
		return isSetField(field);
	}

	public boolean isSetLastRptRequested() {
		return isSetField(912);
	}

	public void set(quickfix.fix50.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.Parties get(quickfix.fix50.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.Parties());
	}

	public void set(quickfix.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(quickfix.field.PartyID value) {
		setField(value);
	}

	public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.field.PartyID());
	}

	public boolean isSet(quickfix.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.PartyIDSource());
	}

	public boolean isSet(quickfix.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.field.PartyRole value) {
		setField(value);
	}

	public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.field.PartyRole());
	}

	public boolean isSet(quickfix.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.fix50.component.PtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.PtysSubGrp get(quickfix.fix50.component.PtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.PtysSubGrp());
	}

	public void set(quickfix.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(quickfix.field.PartySubID value) {
		setField(value);
	}

	public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.field.PartySubID());
	}

	public boolean isSet(quickfix.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.PartySubIDType());
	}

	public boolean isSet(quickfix.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	public void set(quickfix.field.TradeOriginationDate value) {
		setField(value);
	}

	public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
		return get(new quickfix.field.TradeOriginationDate());
	}

	public boolean isSet(quickfix.field.TradeOriginationDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeOriginationDate() {
		return isSetField(229);
	}

	public void set(quickfix.fix50.component.ContraGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.ContraGrp get(quickfix.fix50.component.ContraGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.ContraGrp getContraGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.ContraGrp());
	}

	public void set(quickfix.field.NoContraBrokers value) {
		setField(value);
	}

	public quickfix.field.NoContraBrokers get(quickfix.field.NoContraBrokers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoContraBrokers getNoContraBrokers() throws FieldNotFound {
		return get(new quickfix.field.NoContraBrokers());
	}

	public boolean isSet(quickfix.field.NoContraBrokers field) {
		return isSetField(field);
	}

	public boolean isSetNoContraBrokers() {
		return isSetField(382);
	}

	public static class NoContraBrokers extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {375, 337, 437, 438, 655, 0};

		public NoContraBrokers() {
			super(382, 375, ORDER);
		}
		
	public void set(quickfix.field.ContraBroker value) {
		setField(value);
	}

	public quickfix.field.ContraBroker get(quickfix.field.ContraBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContraBroker getContraBroker() throws FieldNotFound {
		return get(new quickfix.field.ContraBroker());
	}

	public boolean isSet(quickfix.field.ContraBroker field) {
		return isSetField(field);
	}

	public boolean isSetContraBroker() {
		return isSetField(375);
	}

	public void set(quickfix.field.ContraTrader value) {
		setField(value);
	}

	public quickfix.field.ContraTrader get(quickfix.field.ContraTrader value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContraTrader getContraTrader() throws FieldNotFound {
		return get(new quickfix.field.ContraTrader());
	}

	public boolean isSet(quickfix.field.ContraTrader field) {
		return isSetField(field);
	}

	public boolean isSetContraTrader() {
		return isSetField(337);
	}

	public void set(quickfix.field.ContraTradeQty value) {
		setField(value);
	}

	public quickfix.field.ContraTradeQty get(quickfix.field.ContraTradeQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContraTradeQty getContraTradeQty() throws FieldNotFound {
		return get(new quickfix.field.ContraTradeQty());
	}

	public boolean isSet(quickfix.field.ContraTradeQty field) {
		return isSetField(field);
	}

	public boolean isSetContraTradeQty() {
		return isSetField(437);
	}

	public void set(quickfix.field.ContraTradeTime value) {
		setField(value);
	}

	public quickfix.field.ContraTradeTime get(quickfix.field.ContraTradeTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContraTradeTime getContraTradeTime() throws FieldNotFound {
		return get(new quickfix.field.ContraTradeTime());
	}

	public boolean isSet(quickfix.field.ContraTradeTime field) {
		return isSetField(field);
	}

	public boolean isSetContraTradeTime() {
		return isSetField(438);
	}

	public void set(quickfix.field.ContraLegRefID value) {
		setField(value);
	}

	public quickfix.field.ContraLegRefID get(quickfix.field.ContraLegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContraLegRefID getContraLegRefID() throws FieldNotFound {
		return get(new quickfix.field.ContraLegRefID());
	}

	public boolean isSet(quickfix.field.ContraLegRefID field) {
		return isSetField(field);
	}

	public boolean isSetContraLegRefID() {
		return isSetField(655);
	}

	}

	public void set(quickfix.field.ListID value) {
		setField(value);
	}

	public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListID getListID() throws FieldNotFound {
		return get(new quickfix.field.ListID());
	}

	public boolean isSet(quickfix.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(quickfix.field.CrossID value) {
		setField(value);
	}

	public quickfix.field.CrossID get(quickfix.field.CrossID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CrossID getCrossID() throws FieldNotFound {
		return get(new quickfix.field.CrossID());
	}

	public boolean isSet(quickfix.field.CrossID field) {
		return isSetField(field);
	}

	public boolean isSetCrossID() {
		return isSetField(548);
	}

	public void set(quickfix.field.OrigCrossID value) {
		setField(value);
	}

	public quickfix.field.OrigCrossID get(quickfix.field.OrigCrossID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigCrossID getOrigCrossID() throws FieldNotFound {
		return get(new quickfix.field.OrigCrossID());
	}

	public boolean isSet(quickfix.field.OrigCrossID field) {
		return isSetField(field);
	}

	public boolean isSetOrigCrossID() {
		return isSetField(551);
	}

	public void set(quickfix.field.CrossType value) {
		setField(value);
	}

	public quickfix.field.CrossType get(quickfix.field.CrossType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CrossType getCrossType() throws FieldNotFound {
		return get(new quickfix.field.CrossType());
	}

	public boolean isSet(quickfix.field.CrossType field) {
		return isSetField(field);
	}

	public boolean isSetCrossType() {
		return isSetField(549);
	}

	public void set(quickfix.field.ExecID value) {
		setField(value);
	}

	public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.field.ExecID());
	}

	public boolean isSet(quickfix.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.field.ExecRefID value) {
		setField(value);
	}

	public quickfix.field.ExecRefID get(quickfix.field.ExecRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecRefID getExecRefID() throws FieldNotFound {
		return get(new quickfix.field.ExecRefID());
	}

	public boolean isSet(quickfix.field.ExecRefID field) {
		return isSetField(field);
	}

	public boolean isSetExecRefID() {
		return isSetField(19);
	}

	public void set(quickfix.field.ExecType value) {
		setField(value);
	}

	public quickfix.field.ExecType get(quickfix.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.field.ExecType());
	}

	public boolean isSet(quickfix.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(quickfix.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.field.OrdStatus());
	}

	public boolean isSet(quickfix.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.field.WorkingIndicator value) {
		setField(value);
	}

	public quickfix.field.WorkingIndicator get(quickfix.field.WorkingIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.WorkingIndicator getWorkingIndicator() throws FieldNotFound {
		return get(new quickfix.field.WorkingIndicator());
	}

	public boolean isSet(quickfix.field.WorkingIndicator field) {
		return isSetField(field);
	}

	public boolean isSetWorkingIndicator() {
		return isSetField(636);
	}

	public void set(quickfix.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.field.OrdRejReason get(quickfix.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.field.OrdRejReason());
	}

	public boolean isSet(quickfix.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
	}

	public void set(quickfix.field.ExecRestatementReason value) {
		setField(value);
	}

	public quickfix.field.ExecRestatementReason get(quickfix.field.ExecRestatementReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecRestatementReason getExecRestatementReason() throws FieldNotFound {
		return get(new quickfix.field.ExecRestatementReason());
	}

	public boolean isSet(quickfix.field.ExecRestatementReason field) {
		return isSetField(field);
	}

	public boolean isSetExecRestatementReason() {
		return isSetField(378);
	}

	public void set(quickfix.field.Account value) {
		setField(value);
	}

	public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.field.Account());
	}

	public boolean isSet(quickfix.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.field.AcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AcctIDSource());
	}

	public boolean isSet(quickfix.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(quickfix.field.AccountType value) {
		setField(value);
	}

	public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccountType getAccountType() throws FieldNotFound {
		return get(new quickfix.field.AccountType());
	}

	public boolean isSet(quickfix.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
	}

	public void set(quickfix.field.DayBookingInst value) {
		setField(value);
	}

	public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound {
		return get(new quickfix.field.DayBookingInst());
	}

	public boolean isSet(quickfix.field.DayBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetDayBookingInst() {
		return isSetField(589);
	}

	public void set(quickfix.field.BookingUnit value) {
		setField(value);
	}

	public quickfix.field.BookingUnit get(quickfix.field.BookingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound {
		return get(new quickfix.field.BookingUnit());
	}

	public boolean isSet(quickfix.field.BookingUnit field) {
		return isSetField(field);
	}

	public boolean isSetBookingUnit() {
		return isSetField(590);
	}

	public void set(quickfix.field.PreallocMethod value) {
		setField(value);
	}

	public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
		return get(new quickfix.field.PreallocMethod());
	}

	public boolean isSet(quickfix.field.PreallocMethod field) {
		return isSetField(field);
	}

	public boolean isSetPreallocMethod() {
		return isSetField(591);
	}

	public void set(quickfix.field.SettlType value) {
		setField(value);
	}

	public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.field.SettlType());
	}

	public boolean isSet(quickfix.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.field.SettlDate value) {
		setField(value);
	}

	public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new quickfix.field.SettlDate());
	}

	public boolean isSet(quickfix.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.CashMargin value) {
		setField(value);
	}

	public quickfix.field.CashMargin get(quickfix.field.CashMargin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashMargin getCashMargin() throws FieldNotFound {
		return get(new quickfix.field.CashMargin());
	}

	public boolean isSet(quickfix.field.CashMargin field) {
		return isSetField(field);
	}

	public boolean isSetCashMargin() {
		return isSetField(544);
	}

	public void set(quickfix.field.ClearingFeeIndicator value) {
		setField(value);
	}

	public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
		return get(new quickfix.field.ClearingFeeIndicator());
	}

	public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetClearingFeeIndicator() {
		return isSetField(635);
	}

	public void set(quickfix.fix50.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.fix50.component.Instrument get(quickfix.fix50.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.fix50.component.Instrument());
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

	public void set(quickfix.field.SecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityIDSource());
	}

	public boolean isSet(quickfix.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.fix50.component.SecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.SecAltIDGrp get(quickfix.fix50.component.SecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.SecAltIDGrp getSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.SecAltIDGrp());
	}

	public void set(quickfix.field.NoSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(quickfix.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltID());
	}

	public boolean isSet(quickfix.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(quickfix.field.SecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(quickfix.field.Product value) {
		setField(value);
	}

	public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.field.Product());
	}

	public boolean isSet(quickfix.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.field.CFICode value) {
		setField(value);
	}

	public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.field.CFICode());
	}

	public boolean isSet(quickfix.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.SecuritySubType());
	}

	public boolean isSet(quickfix.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(quickfix.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.field.MaturityDate value) {
		setField(value);
	}

	public quickfix.field.MaturityDate get(quickfix.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.MaturityDate());
	}

	public boolean isSet(quickfix.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(quickfix.field.CouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.CouponPaymentDate());
	}

	public boolean isSet(quickfix.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(quickfix.field.IssueDate value) {
		setField(value);
	}

	public quickfix.field.IssueDate get(quickfix.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new quickfix.field.IssueDate());
	}

	public boolean isSet(quickfix.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(quickfix.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.RepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(quickfix.field.RepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseTerm());
	}

	public boolean isSet(quickfix.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(quickfix.field.RepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseRate());
	}

	public boolean isSet(quickfix.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(quickfix.field.Factor value) {
		setField(value);
	}

	public quickfix.field.Factor get(quickfix.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Factor getFactor() throws FieldNotFound {
		return get(new quickfix.field.Factor());
	}

	public boolean isSet(quickfix.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(quickfix.field.CreditRating value) {
		setField(value);
	}

	public quickfix.field.CreditRating get(quickfix.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new quickfix.field.CreditRating());
	}

	public boolean isSet(quickfix.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(quickfix.field.InstrRegistry value) {
		setField(value);
	}

	public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.InstrRegistry());
	}

	public boolean isSet(quickfix.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(quickfix.field.CountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.CountryOfIssue());
	}

	public boolean isSet(quickfix.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(quickfix.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(quickfix.field.LocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(quickfix.field.RedemptionDate value) {
		setField(value);
	}

	public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.RedemptionDate());
	}

	public boolean isSet(quickfix.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(quickfix.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.StrikePrice());
	}

	public boolean isSet(quickfix.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.field.StrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.StrikeCurrency());
	}

	public boolean isSet(quickfix.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(quickfix.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.OptAttribute());
	}

	public boolean isSet(quickfix.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(quickfix.field.CouponRate value) {
		setField(value);
	}

	public quickfix.field.CouponRate get(quickfix.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new quickfix.field.CouponRate());
	}

	public boolean isSet(quickfix.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(quickfix.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.SecurityExchange());
	}

	public boolean isSet(quickfix.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
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

	public void set(quickfix.field.EncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(quickfix.field.EncodedIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuer());
	}

	public boolean isSet(quickfix.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
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

	public void set(quickfix.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(quickfix.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(quickfix.field.Pool value) {
		setField(value);
	}

	public quickfix.field.Pool get(quickfix.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Pool getPool() throws FieldNotFound {
		return get(new quickfix.field.Pool());
	}

	public boolean isSet(quickfix.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(quickfix.field.ContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.ContractSettlMonth());
	}

	public boolean isSet(quickfix.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(quickfix.field.CPProgram value) {
		setField(value);
	}

	public quickfix.field.CPProgram get(quickfix.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new quickfix.field.CPProgram());
	}

	public boolean isSet(quickfix.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(quickfix.field.CPRegType value) {
		setField(value);
	}

	public quickfix.field.CPRegType get(quickfix.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new quickfix.field.CPRegType());
	}

	public boolean isSet(quickfix.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(quickfix.fix50.component.EvntGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.EvntGrp get(quickfix.fix50.component.EvntGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.EvntGrp getEvntGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.EvntGrp());
	}

	public void set(quickfix.field.NoEvents value) {
		setField(value);
	}

	public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.field.NoEvents());
	}

	public boolean isSet(quickfix.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(quickfix.field.EventType value) {
		setField(value);
	}

	public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.field.EventType());
	}

	public boolean isSet(quickfix.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.field.EventDate value) {
		setField(value);
	}

	public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.field.EventDate());
	}

	public boolean isSet(quickfix.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(quickfix.field.EventPx value) {
		setField(value);
	}

	public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventPx getEventPx() throws FieldNotFound {
		return get(new quickfix.field.EventPx());
	}

	public boolean isSet(quickfix.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(quickfix.field.EventText value) {
		setField(value);
	}

	public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventText getEventText() throws FieldNotFound {
		return get(new quickfix.field.EventText());
	}

	public boolean isSet(quickfix.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(quickfix.field.DatedDate value) {
		setField(value);
	}

	public quickfix.field.DatedDate get(quickfix.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new quickfix.field.DatedDate());
	}

	public boolean isSet(quickfix.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(quickfix.field.InterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.InterestAccrualDate());
	}

	public boolean isSet(quickfix.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(quickfix.field.SecurityStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityStatus get(quickfix.field.SecurityStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityStatus getSecurityStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityStatus());
	}

	public boolean isSet(quickfix.field.SecurityStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityStatus() {
		return isSetField(965);
	}

	public void set(quickfix.field.SettleOnOpenFlag value) {
		setField(value);
	}

	public quickfix.field.SettleOnOpenFlag get(quickfix.field.SettleOnOpenFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettleOnOpenFlag getSettleOnOpenFlag() throws FieldNotFound {
		return get(new quickfix.field.SettleOnOpenFlag());
	}

	public boolean isSet(quickfix.field.SettleOnOpenFlag field) {
		return isSetField(field);
	}

	public boolean isSetSettleOnOpenFlag() {
		return isSetField(966);
	}

	public void set(quickfix.field.InstrmtAssignmentMethod value) {
		setField(value);
	}

	public quickfix.field.InstrmtAssignmentMethod get(quickfix.field.InstrmtAssignmentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrmtAssignmentMethod getInstrmtAssignmentMethod() throws FieldNotFound {
		return get(new quickfix.field.InstrmtAssignmentMethod());
	}

	public boolean isSet(quickfix.field.InstrmtAssignmentMethod field) {
		return isSetField(field);
	}

	public boolean isSetInstrmtAssignmentMethod() {
		return isSetField(1049);
	}

	public void set(quickfix.field.StrikeMultiplier value) {
		setField(value);
	}

	public quickfix.field.StrikeMultiplier get(quickfix.field.StrikeMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeMultiplier getStrikeMultiplier() throws FieldNotFound {
		return get(new quickfix.field.StrikeMultiplier());
	}

	public boolean isSet(quickfix.field.StrikeMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetStrikeMultiplier() {
		return isSetField(967);
	}

	public void set(quickfix.field.StrikeValue value) {
		setField(value);
	}

	public quickfix.field.StrikeValue get(quickfix.field.StrikeValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeValue getStrikeValue() throws FieldNotFound {
		return get(new quickfix.field.StrikeValue());
	}

	public boolean isSet(quickfix.field.StrikeValue field) {
		return isSetField(field);
	}

	public boolean isSetStrikeValue() {
		return isSetField(968);
	}

	public void set(quickfix.field.MinPriceIncrement value) {
		setField(value);
	}

	public quickfix.field.MinPriceIncrement get(quickfix.field.MinPriceIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinPriceIncrement getMinPriceIncrement() throws FieldNotFound {
		return get(new quickfix.field.MinPriceIncrement());
	}

	public boolean isSet(quickfix.field.MinPriceIncrement field) {
		return isSetField(field);
	}

	public boolean isSetMinPriceIncrement() {
		return isSetField(969);
	}

	public void set(quickfix.field.PositionLimit value) {
		setField(value);
	}

	public quickfix.field.PositionLimit get(quickfix.field.PositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionLimit getPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.PositionLimit());
	}

	public boolean isSet(quickfix.field.PositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetPositionLimit() {
		return isSetField(970);
	}

	public void set(quickfix.field.NTPositionLimit value) {
		setField(value);
	}

	public quickfix.field.NTPositionLimit get(quickfix.field.NTPositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NTPositionLimit getNTPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.NTPositionLimit());
	}

	public boolean isSet(quickfix.field.NTPositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetNTPositionLimit() {
		return isSetField(971);
	}

	public void set(quickfix.fix50.component.InstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.InstrumentParties get(quickfix.fix50.component.InstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.InstrumentParties getInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.InstrumentParties());
	}

	public void set(quickfix.field.NoInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentParties get(quickfix.field.NoInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentParties getNoInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentParties() {
		return isSetField(1018);
	}

	public static class NoInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1019, 1050, 1051, 1052, 0};

		public NoInstrumentParties() {
			super(1018, 1019, ORDER);
		}
		
	public void set(quickfix.field.InstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyID());
	}

	public boolean isSet(quickfix.field.InstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyID() {
		return isSetField(1019);
	}

	public void set(quickfix.field.InstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyIDSource() {
		return isSetField(1050);
	}

	public void set(quickfix.field.InstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.InstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyRole() {
		return isSetField(1051);
	}

	public void set(quickfix.fix50.component.InstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.InstrumentPtysSubGrp get(quickfix.fix50.component.InstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.InstrumentPtysSubGrp getInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.InstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentPartySubIDs() {
		return isSetField(1052);
	}

	public static class NoInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1053, 1054, 0};

		public NoInstrumentPartySubIDs() {
			super(1052, 1053, ORDER);
		}
		
	public void set(quickfix.field.InstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubID() {
		return isSetField(1053);
	}

	public void set(quickfix.field.InstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubIDType() {
		return isSetField(1054);
	}

	}

	}

	public void set(quickfix.field.UnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnitOfMeasure get(quickfix.field.UnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnitOfMeasure getUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnitOfMeasure() {
		return isSetField(996);
	}

	public void set(quickfix.field.TimeUnit value) {
		setField(value);
	}

	public quickfix.field.TimeUnit get(quickfix.field.TimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeUnit getTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.TimeUnit());
	}

	public boolean isSet(quickfix.field.TimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetTimeUnit() {
		return isSetField(997);
	}

	public void set(quickfix.field.MaturityTime value) {
		setField(value);
	}

	public quickfix.field.MaturityTime get(quickfix.field.MaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityTime getMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.MaturityTime());
	}

	public boolean isSet(quickfix.field.MaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetMaturityTime() {
		return isSetField(1079);
	}

	public void set(quickfix.fix50.component.FinancingDetails component) {
		setComponent(component);
	}

	public quickfix.fix50.component.FinancingDetails get(quickfix.fix50.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new quickfix.fix50.component.FinancingDetails());
	}

	public void set(quickfix.field.AgreementDesc value) {
		setField(value);
	}

	public quickfix.field.AgreementDesc get(quickfix.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new quickfix.field.AgreementDesc());
	}

	public boolean isSet(quickfix.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(quickfix.field.AgreementID value) {
		setField(value);
	}

	public quickfix.field.AgreementID get(quickfix.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new quickfix.field.AgreementID());
	}

	public boolean isSet(quickfix.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(quickfix.field.AgreementDate value) {
		setField(value);
	}

	public quickfix.field.AgreementDate get(quickfix.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new quickfix.field.AgreementDate());
	}

	public boolean isSet(quickfix.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(quickfix.field.AgreementCurrency value) {
		setField(value);
	}

	public quickfix.field.AgreementCurrency get(quickfix.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new quickfix.field.AgreementCurrency());
	}

	public boolean isSet(quickfix.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(quickfix.field.TerminationType value) {
		setField(value);
	}

	public quickfix.field.TerminationType get(quickfix.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new quickfix.field.TerminationType());
	}

	public boolean isSet(quickfix.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(quickfix.field.StartDate value) {
		setField(value);
	}

	public quickfix.field.StartDate get(quickfix.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartDate getStartDate() throws FieldNotFound {
		return get(new quickfix.field.StartDate());
	}

	public boolean isSet(quickfix.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(quickfix.field.EndDate value) {
		setField(value);
	}

	public quickfix.field.EndDate get(quickfix.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndDate getEndDate() throws FieldNotFound {
		return get(new quickfix.field.EndDate());
	}

	public boolean isSet(quickfix.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(quickfix.field.DeliveryType value) {
		setField(value);
	}

	public quickfix.field.DeliveryType get(quickfix.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new quickfix.field.DeliveryType());
	}

	public boolean isSet(quickfix.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(quickfix.field.MarginRatio value) {
		setField(value);
	}

	public quickfix.field.MarginRatio get(quickfix.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new quickfix.field.MarginRatio());
	}

	public boolean isSet(quickfix.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
	}

	public void set(quickfix.fix50.component.UndInstrmtGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UndInstrmtGrp get(quickfix.fix50.component.UndInstrmtGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UndInstrmtGrp getUndInstrmtGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.UndInstrmtGrp());
	}

	public void set(quickfix.field.NoUnderlyings value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyings());
	}

	public boolean isSet(quickfix.field.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 972, 975, 973, 974, 998, 1000, 1038, 1058, 1039, 1044, 1045, 1046, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(quickfix.fix50.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UnderlyingInstrument get(quickfix.fix50.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new quickfix.fix50.component.UnderlyingInstrument());
	}

	public void set(quickfix.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(quickfix.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(quickfix.fix50.component.UndSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UndSecAltIDGrp get(quickfix.fix50.component.UndSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UndSecAltIDGrp getUndSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.UndSecAltIDGrp());
	}

	public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(quickfix.field.UnderlyingProduct value) {
		setField(value);
	}

	public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingProduct());
	}

	public boolean isSet(quickfix.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(quickfix.field.UnderlyingCFICode value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCFICode());
	}

	public boolean isSet(quickfix.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(quickfix.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(quickfix.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityDate());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(quickfix.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(quickfix.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssueDate());
	}

	public boolean isSet(quickfix.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(quickfix.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(quickfix.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(quickfix.field.UnderlyingFactor value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFactor());
	}

	public boolean isSet(quickfix.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(quickfix.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCreditRating());
	}

	public boolean isSet(quickfix.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(quickfix.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(quickfix.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(quickfix.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(quickfix.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(quickfix.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(quickfix.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(quickfix.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(quickfix.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponRate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(quickfix.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.field.UnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(quickfix.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(quickfix.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPProgram());
	}

	public boolean isSet(quickfix.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(quickfix.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPRegType());
	}

	public boolean isSet(quickfix.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(quickfix.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.field.UnderlyingQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingQty());
	}

	public boolean isSet(quickfix.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(quickfix.field.UnderlyingPx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPx());
	}

	public boolean isSet(quickfix.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(quickfix.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(quickfix.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(quickfix.field.UnderlyingStartValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStartValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(quickfix.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrentValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(quickfix.field.UnderlyingEndValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndValue());
	}

	public boolean isSet(quickfix.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(quickfix.fix50.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UnderlyingStipulations get(quickfix.fix50.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new quickfix.fix50.component.UnderlyingStipulations());
	}

	public void set(quickfix.field.NoUnderlyingStips value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingStips());
	}

	public boolean isSet(quickfix.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingStipType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipType());
	}

	public boolean isSet(quickfix.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(quickfix.field.UnderlyingStipValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	public void set(quickfix.field.UnderlyingAllocationPercent value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAllocationPercent get(quickfix.field.UnderlyingAllocationPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAllocationPercent getUnderlyingAllocationPercent() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAllocationPercent());
	}

	public boolean isSet(quickfix.field.UnderlyingAllocationPercent field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAllocationPercent() {
		return isSetField(972);
	}

	public void set(quickfix.field.UnderlyingSettlementType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlementType get(quickfix.field.UnderlyingSettlementType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlementType getUnderlyingSettlementType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlementType());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlementType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlementType() {
		return isSetField(975);
	}

	public void set(quickfix.field.UnderlyingCashAmount value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashAmount get(quickfix.field.UnderlyingCashAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashAmount getUnderlyingCashAmount() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashAmount());
	}

	public boolean isSet(quickfix.field.UnderlyingCashAmount field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashAmount() {
		return isSetField(973);
	}

	public void set(quickfix.field.UnderlyingCashType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashType get(quickfix.field.UnderlyingCashType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashType getUnderlyingCashType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashType());
	}

	public boolean isSet(quickfix.field.UnderlyingCashType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashType() {
		return isSetField(974);
	}

	public void set(quickfix.field.UnderlyingUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnderlyingUnitOfMeasure get(quickfix.field.UnderlyingUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingUnitOfMeasure getUnderlyingUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnderlyingUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingUnitOfMeasure() {
		return isSetField(998);
	}

	public void set(quickfix.field.UnderlyingTimeUnit value) {
		setField(value);
	}

	public quickfix.field.UnderlyingTimeUnit get(quickfix.field.UnderlyingTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingTimeUnit getUnderlyingTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingTimeUnit());
	}

	public boolean isSet(quickfix.field.UnderlyingTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTimeUnit() {
		return isSetField(1000);
	}

	public void set(quickfix.field.UnderlyingCapValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCapValue get(quickfix.field.UnderlyingCapValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCapValue getUnderlyingCapValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCapValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCapValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCapValue() {
		return isSetField(1038);
	}

	public void set(quickfix.fix50.component.UndlyInstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UndlyInstrumentParties get(quickfix.fix50.component.UndlyInstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UndlyInstrumentParties getUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.UndlyInstrumentParties());
	}

	public void set(quickfix.field.NoUndlyInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentParties() {
		return isSetField(1058);
	}

	public static class NoUndlyInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1059, 1060, 1061, 1062, 0};

		public NoUndlyInstrumentParties() {
			super(1058, 1059, ORDER);
		}
		
	public void set(quickfix.field.UndlyInstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.UndlyInstrumentPartyID get(quickfix.field.UndlyInstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UndlyInstrumentPartyID getUndlyInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.UndlyInstrumentPartyID());
	}

	public boolean isSet(quickfix.field.UndlyInstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetUndlyInstrumentPartyID() {
		return isSetField(1059);
	}

	public void set(quickfix.field.UndlyInstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.UndlyInstrumentPartyIDSource get(quickfix.field.UndlyInstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UndlyInstrumentPartyIDSource getUndlyInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.UndlyInstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.UndlyInstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUndlyInstrumentPartyIDSource() {
		return isSetField(1060);
	}

	public void set(quickfix.field.UndlyInstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.UndlyInstrumentPartyRole get(quickfix.field.UndlyInstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UndlyInstrumentPartyRole getUndlyInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.UndlyInstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.UndlyInstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetUndlyInstrumentPartyRole() {
		return isSetField(1061);
	}

	public void set(quickfix.fix50.component.UndlyInstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.UndlyInstrumentPtysSubGrp get(quickfix.fix50.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.UndlyInstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentPartySubIDs() {
		return isSetField(1062);
	}

	public static class NoUndlyInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1063, 1064, 0};

		public NoUndlyInstrumentPartySubIDs() {
			super(1062, 1063, ORDER);
		}
		
	public void set(quickfix.field.UndlyInstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.UndlyInstrumentPartySubID get(quickfix.field.UndlyInstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UndlyInstrumentPartySubID getUndlyInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.UndlyInstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.UndlyInstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetUndlyInstrumentPartySubID() {
		return isSetField(1063);
	}

	public void set(quickfix.field.UndlyInstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.UndlyInstrumentPartySubIDType get(quickfix.field.UndlyInstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UndlyInstrumentPartySubIDType getUndlyInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.UndlyInstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.UndlyInstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetUndlyInstrumentPartySubIDType() {
		return isSetField(1064);
	}

	}

	}

	public void set(quickfix.field.UnderlyingSettlMethod value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlMethod get(quickfix.field.UnderlyingSettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlMethod getUnderlyingSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlMethod());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlMethod() {
		return isSetField(1039);
	}

	public void set(quickfix.field.UnderlyingAdjustedQuantity value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAdjustedQuantity get(quickfix.field.UnderlyingAdjustedQuantity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAdjustedQuantity getUnderlyingAdjustedQuantity() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAdjustedQuantity());
	}

	public boolean isSet(quickfix.field.UnderlyingAdjustedQuantity field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAdjustedQuantity() {
		return isSetField(1044);
	}

	public void set(quickfix.field.UnderlyingFXRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRate get(quickfix.field.UnderlyingFXRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRate getUnderlyingFXRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRate());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRate() {
		return isSetField(1045);
	}

	public void set(quickfix.field.UnderlyingFXRateCalc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRateCalc get(quickfix.field.UnderlyingFXRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRateCalc getUnderlyingFXRateCalc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRateCalc());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRateCalc() {
		return isSetField(1046);
	}

	}

	public void set(quickfix.field.Side value) {
		setField(value);
	}

	public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.field.Side());
	}

	public boolean isSet(quickfix.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.fix50.component.Stipulations component) {
		setComponent(component);
	}

	public quickfix.fix50.component.Stipulations get(quickfix.fix50.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new quickfix.fix50.component.Stipulations());
	}

	public void set(quickfix.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoStipulations());
	}

	public boolean isSet(quickfix.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(quickfix.field.StipulationType value) {
		setField(value);
	}

	public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.field.StipulationType());
	}

	public boolean isSet(quickfix.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.StipulationValue());
	}

	public boolean isSet(quickfix.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

	public void set(quickfix.field.QtyType value) {
		setField(value);
	}

	public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QtyType getQtyType() throws FieldNotFound {
		return get(new quickfix.field.QtyType());
	}

	public boolean isSet(quickfix.field.QtyType field) {
		return isSetField(field);
	}

	public boolean isSetQtyType() {
		return isSetField(854);
	}

	public void set(quickfix.fix50.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix50.component.OrderQtyData get(quickfix.fix50.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix50.component.OrderQtyData());
	}

	public void set(quickfix.field.OrderQty value) {
		setField(value);
	}

	public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.field.OrderQty());
	}

	public boolean isSet(quickfix.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.field.CashOrderQty());
	}

	public boolean isSet(quickfix.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.field.OrderPercent get(quickfix.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.field.OrderPercent());
	}

	public boolean isSet(quickfix.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.field.RoundingDirection());
	}

	public boolean isSet(quickfix.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.field.RoundingModulus());
	}

	public boolean isSet(quickfix.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(quickfix.field.OrdType value) {
		setField(value);
	}

	public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.field.OrdType());
	}

	public boolean isSet(quickfix.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.field.PriceType value) {
		setField(value);
	}

	public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceType getPriceType() throws FieldNotFound {
		return get(new quickfix.field.PriceType());
	}

	public boolean isSet(quickfix.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
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

	public void set(quickfix.field.StopPx value) {
		setField(value);
	}

	public quickfix.field.StopPx get(quickfix.field.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StopPx getStopPx() throws FieldNotFound {
		return get(new quickfix.field.StopPx());
	}

	public boolean isSet(quickfix.field.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(quickfix.fix50.component.PegInstructions component) {
		setComponent(component);
	}

	public quickfix.fix50.component.PegInstructions get(quickfix.fix50.component.PegInstructions component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.PegInstructions getPegInstructions() throws FieldNotFound {
		return get(new quickfix.fix50.component.PegInstructions());
	}

	public void set(quickfix.field.PegOffsetValue value) {
		setField(value);
	}

	public quickfix.field.PegOffsetValue get(quickfix.field.PegOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
		return get(new quickfix.field.PegOffsetValue());
	}

	public boolean isSet(quickfix.field.PegOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetValue() {
		return isSetField(211);
	}

	public void set(quickfix.field.PegMoveType value) {
		setField(value);
	}

	public quickfix.field.PegMoveType get(quickfix.field.PegMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegMoveType getPegMoveType() throws FieldNotFound {
		return get(new quickfix.field.PegMoveType());
	}

	public boolean isSet(quickfix.field.PegMoveType field) {
		return isSetField(field);
	}

	public boolean isSetPegMoveType() {
		return isSetField(835);
	}

	public void set(quickfix.field.PegOffsetType value) {
		setField(value);
	}

	public quickfix.field.PegOffsetType get(quickfix.field.PegOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegOffsetType getPegOffsetType() throws FieldNotFound {
		return get(new quickfix.field.PegOffsetType());
	}

	public boolean isSet(quickfix.field.PegOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetType() {
		return isSetField(836);
	}

	public void set(quickfix.field.PegLimitType value) {
		setField(value);
	}

	public quickfix.field.PegLimitType get(quickfix.field.PegLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegLimitType getPegLimitType() throws FieldNotFound {
		return get(new quickfix.field.PegLimitType());
	}

	public boolean isSet(quickfix.field.PegLimitType field) {
		return isSetField(field);
	}

	public boolean isSetPegLimitType() {
		return isSetField(837);
	}

	public void set(quickfix.field.PegRoundDirection value) {
		setField(value);
	}

	public quickfix.field.PegRoundDirection get(quickfix.field.PegRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegRoundDirection getPegRoundDirection() throws FieldNotFound {
		return get(new quickfix.field.PegRoundDirection());
	}

	public boolean isSet(quickfix.field.PegRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetPegRoundDirection() {
		return isSetField(838);
	}

	public void set(quickfix.field.PegScope value) {
		setField(value);
	}

	public quickfix.field.PegScope get(quickfix.field.PegScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegScope getPegScope() throws FieldNotFound {
		return get(new quickfix.field.PegScope());
	}

	public boolean isSet(quickfix.field.PegScope field) {
		return isSetField(field);
	}

	public boolean isSetPegScope() {
		return isSetField(840);
	}

	public void set(quickfix.field.PegPriceType value) {
		setField(value);
	}

	public quickfix.field.PegPriceType get(quickfix.field.PegPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegPriceType getPegPriceType() throws FieldNotFound {
		return get(new quickfix.field.PegPriceType());
	}

	public boolean isSet(quickfix.field.PegPriceType field) {
		return isSetField(field);
	}

	public boolean isSetPegPriceType() {
		return isSetField(1094);
	}

	public void set(quickfix.field.PegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.PegSecurityIDSource get(quickfix.field.PegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegSecurityIDSource getPegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.PegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.PegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPegSecurityIDSource() {
		return isSetField(1096);
	}

	public void set(quickfix.field.PegSecurityID value) {
		setField(value);
	}

	public quickfix.field.PegSecurityID get(quickfix.field.PegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegSecurityID getPegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.PegSecurityID());
	}

	public boolean isSet(quickfix.field.PegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetPegSecurityID() {
		return isSetField(1097);
	}

	public void set(quickfix.field.PegSymbol value) {
		setField(value);
	}

	public quickfix.field.PegSymbol get(quickfix.field.PegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegSymbol getPegSymbol() throws FieldNotFound {
		return get(new quickfix.field.PegSymbol());
	}

	public boolean isSet(quickfix.field.PegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetPegSymbol() {
		return isSetField(1098);
	}

	public void set(quickfix.field.PegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.PegSecurityDesc get(quickfix.field.PegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegSecurityDesc getPegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.PegSecurityDesc());
	}

	public boolean isSet(quickfix.field.PegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetPegSecurityDesc() {
		return isSetField(1099);
	}

	public void set(quickfix.fix50.component.DiscretionInstructions component) {
		setComponent(component);
	}

	public quickfix.fix50.component.DiscretionInstructions get(quickfix.fix50.component.DiscretionInstructions component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.DiscretionInstructions getDiscretionInstructions() throws FieldNotFound {
		return get(new quickfix.fix50.component.DiscretionInstructions());
	}

	public void set(quickfix.field.DiscretionInst value) {
		setField(value);
	}

	public quickfix.field.DiscretionInst get(quickfix.field.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new quickfix.field.DiscretionInst());
	}

	public boolean isSet(quickfix.field.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(quickfix.field.DiscretionOffsetValue value) {
		setField(value);
	}

	public quickfix.field.DiscretionOffsetValue get(quickfix.field.DiscretionOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionOffsetValue getDiscretionOffsetValue() throws FieldNotFound {
		return get(new quickfix.field.DiscretionOffsetValue());
	}

	public boolean isSet(quickfix.field.DiscretionOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetValue() {
		return isSetField(389);
	}

	public void set(quickfix.field.DiscretionMoveType value) {
		setField(value);
	}

	public quickfix.field.DiscretionMoveType get(quickfix.field.DiscretionMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionMoveType getDiscretionMoveType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionMoveType());
	}

	public boolean isSet(quickfix.field.DiscretionMoveType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionMoveType() {
		return isSetField(841);
	}

	public void set(quickfix.field.DiscretionOffsetType value) {
		setField(value);
	}

	public quickfix.field.DiscretionOffsetType get(quickfix.field.DiscretionOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionOffsetType getDiscretionOffsetType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionOffsetType());
	}

	public boolean isSet(quickfix.field.DiscretionOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetType() {
		return isSetField(842);
	}

	public void set(quickfix.field.DiscretionLimitType value) {
		setField(value);
	}

	public quickfix.field.DiscretionLimitType get(quickfix.field.DiscretionLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionLimitType getDiscretionLimitType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionLimitType());
	}

	public boolean isSet(quickfix.field.DiscretionLimitType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionLimitType() {
		return isSetField(843);
	}

	public void set(quickfix.field.DiscretionRoundDirection value) {
		setField(value);
	}

	public quickfix.field.DiscretionRoundDirection get(quickfix.field.DiscretionRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionRoundDirection getDiscretionRoundDirection() throws FieldNotFound {
		return get(new quickfix.field.DiscretionRoundDirection());
	}

	public boolean isSet(quickfix.field.DiscretionRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionRoundDirection() {
		return isSetField(844);
	}

	public void set(quickfix.field.DiscretionScope value) {
		setField(value);
	}

	public quickfix.field.DiscretionScope get(quickfix.field.DiscretionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionScope getDiscretionScope() throws FieldNotFound {
		return get(new quickfix.field.DiscretionScope());
	}

	public boolean isSet(quickfix.field.DiscretionScope field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionScope() {
		return isSetField(846);
	}

	public void set(quickfix.field.PeggedPrice value) {
		setField(value);
	}

	public quickfix.field.PeggedPrice get(quickfix.field.PeggedPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PeggedPrice getPeggedPrice() throws FieldNotFound {
		return get(new quickfix.field.PeggedPrice());
	}

	public boolean isSet(quickfix.field.PeggedPrice field) {
		return isSetField(field);
	}

	public boolean isSetPeggedPrice() {
		return isSetField(839);
	}

	public void set(quickfix.field.DiscretionPrice value) {
		setField(value);
	}

	public quickfix.field.DiscretionPrice get(quickfix.field.DiscretionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionPrice getDiscretionPrice() throws FieldNotFound {
		return get(new quickfix.field.DiscretionPrice());
	}

	public boolean isSet(quickfix.field.DiscretionPrice field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionPrice() {
		return isSetField(845);
	}

	public void set(quickfix.field.TargetStrategy value) {
		setField(value);
	}

	public quickfix.field.TargetStrategy get(quickfix.field.TargetStrategy value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetStrategy getTargetStrategy() throws FieldNotFound {
		return get(new quickfix.field.TargetStrategy());
	}

	public boolean isSet(quickfix.field.TargetStrategy field) {
		return isSetField(field);
	}

	public boolean isSetTargetStrategy() {
		return isSetField(847);
	}

	public void set(quickfix.field.TargetStrategyParameters value) {
		setField(value);
	}

	public quickfix.field.TargetStrategyParameters get(quickfix.field.TargetStrategyParameters value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetStrategyParameters getTargetStrategyParameters() throws FieldNotFound {
		return get(new quickfix.field.TargetStrategyParameters());
	}

	public boolean isSet(quickfix.field.TargetStrategyParameters field) {
		return isSetField(field);
	}

	public boolean isSetTargetStrategyParameters() {
		return isSetField(848);
	}

	public void set(quickfix.field.ParticipationRate value) {
		setField(value);
	}

	public quickfix.field.ParticipationRate get(quickfix.field.ParticipationRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ParticipationRate getParticipationRate() throws FieldNotFound {
		return get(new quickfix.field.ParticipationRate());
	}

	public boolean isSet(quickfix.field.ParticipationRate field) {
		return isSetField(field);
	}

	public boolean isSetParticipationRate() {
		return isSetField(849);
	}

	public void set(quickfix.field.TargetStrategyPerformance value) {
		setField(value);
	}

	public quickfix.field.TargetStrategyPerformance get(quickfix.field.TargetStrategyPerformance value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetStrategyPerformance getTargetStrategyPerformance() throws FieldNotFound {
		return get(new quickfix.field.TargetStrategyPerformance());
	}

	public boolean isSet(quickfix.field.TargetStrategyPerformance field) {
		return isSetField(field);
	}

	public boolean isSetTargetStrategyPerformance() {
		return isSetField(850);
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

	public void set(quickfix.field.ComplianceID value) {
		setField(value);
	}

	public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
		return get(new quickfix.field.ComplianceID());
	}

	public boolean isSet(quickfix.field.ComplianceID field) {
		return isSetField(field);
	}

	public boolean isSetComplianceID() {
		return isSetField(376);
	}

	public void set(quickfix.field.SolicitedFlag value) {
		setField(value);
	}

	public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
		return get(new quickfix.field.SolicitedFlag());
	}

	public boolean isSet(quickfix.field.SolicitedFlag field) {
		return isSetField(field);
	}

	public boolean isSetSolicitedFlag() {
		return isSetField(377);
	}

	public void set(quickfix.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.field.TimeInForce());
	}

	public boolean isSet(quickfix.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	public void set(quickfix.field.EffectiveTime value) {
		setField(value);
	}

	public quickfix.field.EffectiveTime get(quickfix.field.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new quickfix.field.EffectiveTime());
	}

	public boolean isSet(quickfix.field.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
	}

	public void set(quickfix.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.field.ExpireDate get(quickfix.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.field.ExpireDate());
	}

	public boolean isSet(quickfix.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
	}

	public void set(quickfix.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.field.ExpireTime());
	}

	public boolean isSet(quickfix.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.field.ExecInst value) {
		setField(value);
	}

	public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.field.ExecInst());
	}

	public boolean isSet(quickfix.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(quickfix.field.OrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrderCapacity());
	}

	public boolean isSet(quickfix.field.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(528);
	}

	public void set(quickfix.field.OrderRestrictions value) {
		setField(value);
	}

	public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
		return get(new quickfix.field.OrderRestrictions());
	}

	public boolean isSet(quickfix.field.OrderRestrictions field) {
		return isSetField(field);
	}

	public boolean isSetOrderRestrictions() {
		return isSetField(529);
	}

	public void set(quickfix.field.CustOrderCapacity value) {
		setField(value);
	}

	public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.CustOrderCapacity());
	}

	public boolean isSet(quickfix.field.CustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderCapacity() {
		return isSetField(582);
	}

	public void set(quickfix.field.LastQty value) {
		setField(value);
	}

	public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastQty getLastQty() throws FieldNotFound {
		return get(new quickfix.field.LastQty());
	}

	public boolean isSet(quickfix.field.LastQty field) {
		return isSetField(field);
	}

	public boolean isSetLastQty() {
		return isSetField(32);
	}

	public void set(quickfix.field.UnderlyingLastQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLastQty get(quickfix.field.UnderlyingLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLastQty getUnderlyingLastQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLastQty());
	}

	public boolean isSet(quickfix.field.UnderlyingLastQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLastQty() {
		return isSetField(652);
	}

	public void set(quickfix.field.LastPx value) {
		setField(value);
	}

	public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.field.LastPx());
	}

	public boolean isSet(quickfix.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(quickfix.field.UnderlyingLastPx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLastPx get(quickfix.field.UnderlyingLastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLastPx getUnderlyingLastPx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLastPx());
	}

	public boolean isSet(quickfix.field.UnderlyingLastPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLastPx() {
		return isSetField(651);
	}

	public void set(quickfix.field.LastParPx value) {
		setField(value);
	}

	public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
		return get(new quickfix.field.LastParPx());
	}

	public boolean isSet(quickfix.field.LastParPx field) {
		return isSetField(field);
	}

	public boolean isSetLastParPx() {
		return isSetField(669);
	}

	public void set(quickfix.field.LastSpotRate value) {
		setField(value);
	}

	public quickfix.field.LastSpotRate get(quickfix.field.LastSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastSpotRate getLastSpotRate() throws FieldNotFound {
		return get(new quickfix.field.LastSpotRate());
	}

	public boolean isSet(quickfix.field.LastSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetLastSpotRate() {
		return isSetField(194);
	}

	public void set(quickfix.field.LastForwardPoints value) {
		setField(value);
	}

	public quickfix.field.LastForwardPoints get(quickfix.field.LastForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastForwardPoints getLastForwardPoints() throws FieldNotFound {
		return get(new quickfix.field.LastForwardPoints());
	}

	public boolean isSet(quickfix.field.LastForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetLastForwardPoints() {
		return isSetField(195);
	}

	public void set(quickfix.field.LastMkt value) {
		setField(value);
	}

	public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new quickfix.field.LastMkt());
	}

	public boolean isSet(quickfix.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
	}

	public void set(quickfix.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionID());
	}

	public boolean isSet(quickfix.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(quickfix.field.TimeBracket value) {
		setField(value);
	}

	public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
		return get(new quickfix.field.TimeBracket());
	}

	public boolean isSet(quickfix.field.TimeBracket field) {
		return isSetField(field);
	}

	public boolean isSetTimeBracket() {
		return isSetField(943);
	}

	public void set(quickfix.field.LastCapacity value) {
		setField(value);
	}

	public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
		return get(new quickfix.field.LastCapacity());
	}

	public boolean isSet(quickfix.field.LastCapacity field) {
		return isSetField(field);
	}

	public boolean isSetLastCapacity() {
		return isSetField(29);
	}

	public void set(quickfix.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.field.LeavesQty());
	}

	public boolean isSet(quickfix.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.field.CumQty value) {
		setField(value);
	}

	public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.field.CumQty());
	}

	public boolean isSet(quickfix.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(quickfix.field.AvgPx value) {
		setField(value);
	}

	public quickfix.field.AvgPx get(quickfix.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.field.AvgPx());
	}

	public boolean isSet(quickfix.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(quickfix.field.DayOrderQty value) {
		setField(value);
	}

	public quickfix.field.DayOrderQty get(quickfix.field.DayOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DayOrderQty getDayOrderQty() throws FieldNotFound {
		return get(new quickfix.field.DayOrderQty());
	}

	public boolean isSet(quickfix.field.DayOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetDayOrderQty() {
		return isSetField(424);
	}

	public void set(quickfix.field.DayCumQty value) {
		setField(value);
	}

	public quickfix.field.DayCumQty get(quickfix.field.DayCumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DayCumQty getDayCumQty() throws FieldNotFound {
		return get(new quickfix.field.DayCumQty());
	}

	public boolean isSet(quickfix.field.DayCumQty field) {
		return isSetField(field);
	}

	public boolean isSetDayCumQty() {
		return isSetField(425);
	}

	public void set(quickfix.field.DayAvgPx value) {
		setField(value);
	}

	public quickfix.field.DayAvgPx get(quickfix.field.DayAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DayAvgPx getDayAvgPx() throws FieldNotFound {
		return get(new quickfix.field.DayAvgPx());
	}

	public boolean isSet(quickfix.field.DayAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetDayAvgPx() {
		return isSetField(426);
	}

	public void set(quickfix.field.GTBookingInst value) {
		setField(value);
	}

	public quickfix.field.GTBookingInst get(quickfix.field.GTBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.GTBookingInst getGTBookingInst() throws FieldNotFound {
		return get(new quickfix.field.GTBookingInst());
	}

	public boolean isSet(quickfix.field.GTBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetGTBookingInst() {
		return isSetField(427);
	}

	public void set(quickfix.field.TradeDate value) {
		setField(value);
	}

	public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.field.TradeDate());
	}

	public boolean isSet(quickfix.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(quickfix.field.ReportToExch value) {
		setField(value);
	}

	public quickfix.field.ReportToExch get(quickfix.field.ReportToExch value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ReportToExch getReportToExch() throws FieldNotFound {
		return get(new quickfix.field.ReportToExch());
	}

	public boolean isSet(quickfix.field.ReportToExch field) {
		return isSetField(field);
	}

	public boolean isSetReportToExch() {
		return isSetField(113);
	}

	public void set(quickfix.fix50.component.CommissionData component) {
		setComponent(component);
	}

	public quickfix.fix50.component.CommissionData get(quickfix.fix50.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new quickfix.fix50.component.CommissionData());
	}

	public void set(quickfix.field.Commission value) {
		setField(value);
	}

	public quickfix.field.Commission get(quickfix.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Commission getCommission() throws FieldNotFound {
		return get(new quickfix.field.Commission());
	}

	public boolean isSet(quickfix.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(quickfix.field.CommType value) {
		setField(value);
	}

	public quickfix.field.CommType get(quickfix.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommType getCommType() throws FieldNotFound {
		return get(new quickfix.field.CommType());
	}

	public boolean isSet(quickfix.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(quickfix.field.CommCurrency value) {
		setField(value);
	}

	public quickfix.field.CommCurrency get(quickfix.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new quickfix.field.CommCurrency());
	}

	public boolean isSet(quickfix.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(quickfix.field.FundRenewWaiv value) {
		setField(value);
	}

	public quickfix.field.FundRenewWaiv get(quickfix.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new quickfix.field.FundRenewWaiv());
	}

	public boolean isSet(quickfix.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

	public void set(quickfix.fix50.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.fix50.component.SpreadOrBenchmarkCurveData get(quickfix.fix50.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.fix50.component.SpreadOrBenchmarkCurveData());
	}

	public void set(quickfix.field.Spread value) {
		setField(value);
	}

	public quickfix.field.Spread get(quickfix.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.field.Spread());
	}

	public boolean isSet(quickfix.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveCurrency get(quickfix.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveName get(quickfix.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurvePoint get(quickfix.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPrice get(quickfix.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPriceType get(quickfix.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityID get(quickfix.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityIDSource get(quickfix.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(quickfix.fix50.component.YieldData component) {
		setComponent(component);
	}

	public quickfix.fix50.component.YieldData get(quickfix.fix50.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.YieldData getYieldData() throws FieldNotFound {
		return get(new quickfix.fix50.component.YieldData());
	}

	public void set(quickfix.field.YieldType value) {
		setField(value);
	}

	public quickfix.field.YieldType get(quickfix.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.field.YieldType());
	}

	public boolean isSet(quickfix.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.field.Yield value) {
		setField(value);
	}

	public quickfix.field.Yield get(quickfix.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.field.Yield());
	}

	public boolean isSet(quickfix.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.field.YieldCalcDate get(quickfix.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionDate get(quickfix.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPrice get(quickfix.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPriceType get(quickfix.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(quickfix.field.GrossTradeAmt value) {
		setField(value);
	}

	public quickfix.field.GrossTradeAmt get(quickfix.field.GrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound {
		return get(new quickfix.field.GrossTradeAmt());
	}

	public boolean isSet(quickfix.field.GrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetGrossTradeAmt() {
		return isSetField(381);
	}

	public void set(quickfix.field.NumDaysInterest value) {
		setField(value);
	}

	public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
		return get(new quickfix.field.NumDaysInterest());
	}

	public boolean isSet(quickfix.field.NumDaysInterest field) {
		return isSetField(field);
	}

	public boolean isSetNumDaysInterest() {
		return isSetField(157);
	}

	public void set(quickfix.field.ExDate value) {
		setField(value);
	}

	public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExDate getExDate() throws FieldNotFound {
		return get(new quickfix.field.ExDate());
	}

	public boolean isSet(quickfix.field.ExDate field) {
		return isSetField(field);
	}

	public boolean isSetExDate() {
		return isSetField(230);
	}

	public void set(quickfix.field.AccruedInterestRate value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestRate());
	}

	public boolean isSet(quickfix.field.AccruedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestRate() {
		return isSetField(158);
	}

	public void set(quickfix.field.AccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(159);
	}

	public void set(quickfix.field.InterestAtMaturity value) {
		setField(value);
	}

	public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
		return get(new quickfix.field.InterestAtMaturity());
	}

	public boolean isSet(quickfix.field.InterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetInterestAtMaturity() {
		return isSetField(738);
	}

	public void set(quickfix.field.EndAccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.EndAccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.EndAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetEndAccruedInterestAmt() {
		return isSetField(920);
	}

	public void set(quickfix.field.StartCash value) {
		setField(value);
	}

	public quickfix.field.StartCash get(quickfix.field.StartCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartCash getStartCash() throws FieldNotFound {
		return get(new quickfix.field.StartCash());
	}

	public boolean isSet(quickfix.field.StartCash field) {
		return isSetField(field);
	}

	public boolean isSetStartCash() {
		return isSetField(921);
	}

	public void set(quickfix.field.EndCash value) {
		setField(value);
	}

	public quickfix.field.EndCash get(quickfix.field.EndCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndCash getEndCash() throws FieldNotFound {
		return get(new quickfix.field.EndCash());
	}

	public boolean isSet(quickfix.field.EndCash field) {
		return isSetField(field);
	}

	public boolean isSetEndCash() {
		return isSetField(922);
	}

	public void set(quickfix.field.TradedFlatSwitch value) {
		setField(value);
	}

	public quickfix.field.TradedFlatSwitch get(quickfix.field.TradedFlatSwitch value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradedFlatSwitch getTradedFlatSwitch() throws FieldNotFound {
		return get(new quickfix.field.TradedFlatSwitch());
	}

	public boolean isSet(quickfix.field.TradedFlatSwitch field) {
		return isSetField(field);
	}

	public boolean isSetTradedFlatSwitch() {
		return isSetField(258);
	}

	public void set(quickfix.field.BasisFeatureDate value) {
		setField(value);
	}

	public quickfix.field.BasisFeatureDate get(quickfix.field.BasisFeatureDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BasisFeatureDate getBasisFeatureDate() throws FieldNotFound {
		return get(new quickfix.field.BasisFeatureDate());
	}

	public boolean isSet(quickfix.field.BasisFeatureDate field) {
		return isSetField(field);
	}

	public boolean isSetBasisFeatureDate() {
		return isSetField(259);
	}

	public void set(quickfix.field.BasisFeaturePrice value) {
		setField(value);
	}

	public quickfix.field.BasisFeaturePrice get(quickfix.field.BasisFeaturePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BasisFeaturePrice getBasisFeaturePrice() throws FieldNotFound {
		return get(new quickfix.field.BasisFeaturePrice());
	}

	public boolean isSet(quickfix.field.BasisFeaturePrice field) {
		return isSetField(field);
	}

	public boolean isSetBasisFeaturePrice() {
		return isSetField(260);
	}

	public void set(quickfix.field.Concession value) {
		setField(value);
	}

	public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Concession getConcession() throws FieldNotFound {
		return get(new quickfix.field.Concession());
	}

	public boolean isSet(quickfix.field.Concession field) {
		return isSetField(field);
	}

	public boolean isSetConcession() {
		return isSetField(238);
	}

	public void set(quickfix.field.TotalTakedown value) {
		setField(value);
	}

	public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
		return get(new quickfix.field.TotalTakedown());
	}

	public boolean isSet(quickfix.field.TotalTakedown field) {
		return isSetField(field);
	}

	public boolean isSetTotalTakedown() {
		return isSetField(237);
	}

	public void set(quickfix.field.NetMoney value) {
		setField(value);
	}

	public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
		return get(new quickfix.field.NetMoney());
	}

	public boolean isSet(quickfix.field.NetMoney field) {
		return isSetField(field);
	}

	public boolean isSetNetMoney() {
		return isSetField(118);
	}

	public void set(quickfix.field.SettlCurrAmt value) {
		setField(value);
	}

	public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrAmt());
	}

	public boolean isSet(quickfix.field.SettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrAmt() {
		return isSetField(119);
	}

	public void set(quickfix.field.SettlCurrency value) {
		setField(value);
	}

	public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrency());
	}

	public boolean isSet(quickfix.field.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(quickfix.field.SettlCurrFxRate value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRate());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRate() {
		return isSetField(155);
	}

	public void set(quickfix.field.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRateCalc());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
	}

	public void set(quickfix.field.HandlInst value) {
		setField(value);
	}

	public quickfix.field.HandlInst get(quickfix.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.field.HandlInst());
	}

	public boolean isSet(quickfix.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
	}

	public void set(quickfix.field.MinQty value) {
		setField(value);
	}

	public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.field.MinQty());
	}

	public boolean isSet(quickfix.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(quickfix.field.MaxFloor value) {
		setField(value);
	}

	public quickfix.field.MaxFloor get(quickfix.field.MaxFloor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxFloor getMaxFloor() throws FieldNotFound {
		return get(new quickfix.field.MaxFloor());
	}

	public boolean isSet(quickfix.field.MaxFloor field) {
		return isSetField(field);
	}

	public boolean isSetMaxFloor() {
		return isSetField(111);
	}

	public void set(quickfix.field.PositionEffect value) {
		setField(value);
	}

	public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.PositionEffect());
	}

	public boolean isSet(quickfix.field.PositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetPositionEffect() {
		return isSetField(77);
	}

	public void set(quickfix.field.MaxShow value) {
		setField(value);
	}

	public quickfix.field.MaxShow get(quickfix.field.MaxShow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxShow getMaxShow() throws FieldNotFound {
		return get(new quickfix.field.MaxShow());
	}

	public boolean isSet(quickfix.field.MaxShow field) {
		return isSetField(field);
	}

	public boolean isSetMaxShow() {
		return isSetField(210);
	}

	public void set(quickfix.field.BookingType value) {
		setField(value);
	}

	public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingType getBookingType() throws FieldNotFound {
		return get(new quickfix.field.BookingType());
	}

	public boolean isSet(quickfix.field.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
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

	public void set(quickfix.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.field.EncodedText value) {
		setField(value);
	}

	public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.field.EncodedText());
	}

	public boolean isSet(quickfix.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

	public void set(quickfix.field.SettlDate2 value) {
		setField(value);
	}

	public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
		return get(new quickfix.field.SettlDate2());
	}

	public boolean isSet(quickfix.field.SettlDate2 field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate2() {
		return isSetField(193);
	}

	public void set(quickfix.field.OrderQty2 value) {
		setField(value);
	}

	public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new quickfix.field.OrderQty2());
	}

	public boolean isSet(quickfix.field.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

	public void set(quickfix.field.LastForwardPoints2 value) {
		setField(value);
	}

	public quickfix.field.LastForwardPoints2 get(quickfix.field.LastForwardPoints2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastForwardPoints2 getLastForwardPoints2() throws FieldNotFound {
		return get(new quickfix.field.LastForwardPoints2());
	}

	public boolean isSet(quickfix.field.LastForwardPoints2 field) {
		return isSetField(field);
	}

	public boolean isSetLastForwardPoints2() {
		return isSetField(641);
	}

	public void set(quickfix.field.MultiLegReportingType value) {
		setField(value);
	}

	public quickfix.field.MultiLegReportingType get(quickfix.field.MultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
		return get(new quickfix.field.MultiLegReportingType());
	}

	public boolean isSet(quickfix.field.MultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetMultiLegReportingType() {
		return isSetField(442);
	}

	public void set(quickfix.field.CancellationRights value) {
		setField(value);
	}

	public quickfix.field.CancellationRights get(quickfix.field.CancellationRights value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CancellationRights getCancellationRights() throws FieldNotFound {
		return get(new quickfix.field.CancellationRights());
	}

	public boolean isSet(quickfix.field.CancellationRights field) {
		return isSetField(field);
	}

	public boolean isSetCancellationRights() {
		return isSetField(480);
	}

	public void set(quickfix.field.MoneyLaunderingStatus value) {
		setField(value);
	}

	public quickfix.field.MoneyLaunderingStatus get(quickfix.field.MoneyLaunderingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MoneyLaunderingStatus getMoneyLaunderingStatus() throws FieldNotFound {
		return get(new quickfix.field.MoneyLaunderingStatus());
	}

	public boolean isSet(quickfix.field.MoneyLaunderingStatus field) {
		return isSetField(field);
	}

	public boolean isSetMoneyLaunderingStatus() {
		return isSetField(481);
	}

	public void set(quickfix.field.RegistID value) {
		setField(value);
	}

	public quickfix.field.RegistID get(quickfix.field.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistID getRegistID() throws FieldNotFound {
		return get(new quickfix.field.RegistID());
	}

	public boolean isSet(quickfix.field.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(quickfix.field.Designation value) {
		setField(value);
	}

	public quickfix.field.Designation get(quickfix.field.Designation value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Designation getDesignation() throws FieldNotFound {
		return get(new quickfix.field.Designation());
	}

	public boolean isSet(quickfix.field.Designation field) {
		return isSetField(field);
	}

	public boolean isSetDesignation() {
		return isSetField(494);
	}

	public void set(quickfix.field.TransBkdTime value) {
		setField(value);
	}

	public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
		return get(new quickfix.field.TransBkdTime());
	}

	public boolean isSet(quickfix.field.TransBkdTime field) {
		return isSetField(field);
	}

	public boolean isSetTransBkdTime() {
		return isSetField(483);
	}

	public void set(quickfix.field.ExecValuationPoint value) {
		setField(value);
	}

	public quickfix.field.ExecValuationPoint get(quickfix.field.ExecValuationPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecValuationPoint getExecValuationPoint() throws FieldNotFound {
		return get(new quickfix.field.ExecValuationPoint());
	}

	public boolean isSet(quickfix.field.ExecValuationPoint field) {
		return isSetField(field);
	}

	public boolean isSetExecValuationPoint() {
		return isSetField(515);
	}

	public void set(quickfix.field.ExecPriceType value) {
		setField(value);
	}

	public quickfix.field.ExecPriceType get(quickfix.field.ExecPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecPriceType getExecPriceType() throws FieldNotFound {
		return get(new quickfix.field.ExecPriceType());
	}

	public boolean isSet(quickfix.field.ExecPriceType field) {
		return isSetField(field);
	}

	public boolean isSetExecPriceType() {
		return isSetField(484);
	}

	public void set(quickfix.field.ExecPriceAdjustment value) {
		setField(value);
	}

	public quickfix.field.ExecPriceAdjustment get(quickfix.field.ExecPriceAdjustment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecPriceAdjustment getExecPriceAdjustment() throws FieldNotFound {
		return get(new quickfix.field.ExecPriceAdjustment());
	}

	public boolean isSet(quickfix.field.ExecPriceAdjustment field) {
		return isSetField(field);
	}

	public boolean isSetExecPriceAdjustment() {
		return isSetField(485);
	}

	public void set(quickfix.field.PriorityIndicator value) {
		setField(value);
	}

	public quickfix.field.PriorityIndicator get(quickfix.field.PriorityIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriorityIndicator getPriorityIndicator() throws FieldNotFound {
		return get(new quickfix.field.PriorityIndicator());
	}

	public boolean isSet(quickfix.field.PriorityIndicator field) {
		return isSetField(field);
	}

	public boolean isSetPriorityIndicator() {
		return isSetField(638);
	}

	public void set(quickfix.field.PriceImprovement value) {
		setField(value);
	}

	public quickfix.field.PriceImprovement get(quickfix.field.PriceImprovement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceImprovement getPriceImprovement() throws FieldNotFound {
		return get(new quickfix.field.PriceImprovement());
	}

	public boolean isSet(quickfix.field.PriceImprovement field) {
		return isSetField(field);
	}

	public boolean isSetPriceImprovement() {
		return isSetField(639);
	}

	public void set(quickfix.field.LastLiquidityInd value) {
		setField(value);
	}

	public quickfix.field.LastLiquidityInd get(quickfix.field.LastLiquidityInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastLiquidityInd getLastLiquidityInd() throws FieldNotFound {
		return get(new quickfix.field.LastLiquidityInd());
	}

	public boolean isSet(quickfix.field.LastLiquidityInd field) {
		return isSetField(field);
	}

	public boolean isSetLastLiquidityInd() {
		return isSetField(851);
	}

	public void set(quickfix.fix50.component.ContAmtGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.ContAmtGrp get(quickfix.fix50.component.ContAmtGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.ContAmtGrp getContAmtGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.ContAmtGrp());
	}

	public void set(quickfix.field.NoContAmts value) {
		setField(value);
	}

	public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
		return get(new quickfix.field.NoContAmts());
	}

	public boolean isSet(quickfix.field.NoContAmts field) {
		return isSetField(field);
	}

	public boolean isSetNoContAmts() {
		return isSetField(518);
	}

	public static class NoContAmts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {519, 520, 521, 0};

		public NoContAmts() {
			super(518, 519, ORDER);
		}
		
	public void set(quickfix.field.ContAmtType value) {
		setField(value);
	}

	public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
		return get(new quickfix.field.ContAmtType());
	}

	public boolean isSet(quickfix.field.ContAmtType field) {
		return isSetField(field);
	}

	public boolean isSetContAmtType() {
		return isSetField(519);
	}

	public void set(quickfix.field.ContAmtValue value) {
		setField(value);
	}

	public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
		return get(new quickfix.field.ContAmtValue());
	}

	public boolean isSet(quickfix.field.ContAmtValue field) {
		return isSetField(field);
	}

	public boolean isSetContAmtValue() {
		return isSetField(520);
	}

	public void set(quickfix.field.ContAmtCurr value) {
		setField(value);
	}

	public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
		return get(new quickfix.field.ContAmtCurr());
	}

	public boolean isSet(quickfix.field.ContAmtCurr field) {
		return isSetField(field);
	}

	public boolean isSetContAmtCurr() {
		return isSetField(521);
	}

	}

	public void set(quickfix.fix50.component.InstrmtLegExecGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.InstrmtLegExecGrp get(quickfix.fix50.component.InstrmtLegExecGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.InstrmtLegExecGrp getInstrmtLegExecGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.InstrmtLegExecGrp());
	}

	public void set(quickfix.field.NoLegs value) {
		setField(value);
	}

	public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new quickfix.field.NoLegs());
	}

	public boolean isSet(quickfix.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 999, 1001, 687, 685, 690, 683, 564, 565, 539, 654, 566, 587, 588, 637, 675, 1073, 1074, 1075, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(quickfix.fix50.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix50.component.InstrumentLeg get(quickfix.fix50.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix50.component.InstrumentLeg());
	}

	public void set(quickfix.field.LegSymbol value) {
		setField(value);
	}

	public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new quickfix.field.LegSymbol());
	}

	public boolean isSet(quickfix.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(quickfix.field.LegSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.LegSymbolSfx get(quickfix.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.LegSymbolSfx());
	}

	public boolean isSet(quickfix.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(quickfix.field.LegSecurityID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityID get(quickfix.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityID());
	}

	public boolean isSet(quickfix.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(quickfix.field.LegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityIDSource get(quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(quickfix.fix50.component.LegSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.LegSecAltIDGrp get(quickfix.fix50.component.LegSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.LegSecAltIDGrp getLegSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.LegSecAltIDGrp());
	}

	public void set(quickfix.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(quickfix.field.LegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltID());
	}

	public boolean isSet(quickfix.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(quickfix.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(quickfix.field.LegProduct value) {
		setField(value);
	}

	public quickfix.field.LegProduct get(quickfix.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new quickfix.field.LegProduct());
	}

	public boolean isSet(quickfix.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(quickfix.field.LegCFICode value) {
		setField(value);
	}

	public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new quickfix.field.LegCFICode());
	}

	public boolean isSet(quickfix.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(quickfix.field.LegSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegSecurityType get(quickfix.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityType());
	}

	public boolean isSet(quickfix.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(quickfix.field.LegSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.LegSecuritySubType get(quickfix.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.LegSecuritySubType());
	}

	public boolean isSet(quickfix.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(quickfix.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.LegMaturityMonthYear get(quickfix.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(quickfix.field.LegMaturityDate value) {
		setField(value);
	}

	public quickfix.field.LegMaturityDate get(quickfix.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityDate());
	}

	public boolean isSet(quickfix.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(quickfix.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.LegCouponPaymentDate get(quickfix.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(quickfix.field.LegIssueDate value) {
		setField(value);
	}

	public quickfix.field.LegIssueDate get(quickfix.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new quickfix.field.LegIssueDate());
	}

	public boolean isSet(quickfix.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(quickfix.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegRepoCollateralSecurityType get(quickfix.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(quickfix.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseTerm get(quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(quickfix.field.LegRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseRate get(quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseRate());
	}

	public boolean isSet(quickfix.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(quickfix.field.LegFactor value) {
		setField(value);
	}

	public quickfix.field.LegFactor get(quickfix.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new quickfix.field.LegFactor());
	}

	public boolean isSet(quickfix.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(quickfix.field.LegCreditRating value) {
		setField(value);
	}

	public quickfix.field.LegCreditRating get(quickfix.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new quickfix.field.LegCreditRating());
	}

	public boolean isSet(quickfix.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(quickfix.field.LegInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.LegInstrRegistry get(quickfix.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.LegInstrRegistry());
	}

	public boolean isSet(quickfix.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(quickfix.field.LegCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegCountryOfIssue get(quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegCountryOfIssue());
	}

	public boolean isSet(quickfix.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegStateOrProvinceOfIssue get(quickfix.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(quickfix.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegLocaleOfIssue get(quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(quickfix.field.LegRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.LegRedemptionDate get(quickfix.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.LegRedemptionDate());
	}

	public boolean isSet(quickfix.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(quickfix.field.LegStrikePrice value) {
		setField(value);
	}

	public quickfix.field.LegStrikePrice get(quickfix.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.LegStrikePrice());
	}

	public boolean isSet(quickfix.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(quickfix.field.LegStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.LegStrikeCurrency get(quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegStrikeCurrency());
	}

	public boolean isSet(quickfix.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(quickfix.field.LegOptAttribute value) {
		setField(value);
	}

	public quickfix.field.LegOptAttribute get(quickfix.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.LegOptAttribute());
	}

	public boolean isSet(quickfix.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(quickfix.field.LegContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplier get(quickfix.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplier());
	}

	public boolean isSet(quickfix.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(quickfix.field.LegCouponRate value) {
		setField(value);
	}

	public quickfix.field.LegCouponRate get(quickfix.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponRate());
	}

	public boolean isSet(quickfix.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(quickfix.field.LegSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.LegSecurityExchange get(quickfix.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityExchange());
	}

	public boolean isSet(quickfix.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(quickfix.field.LegIssuer value) {
		setField(value);
	}

	public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.LegIssuer());
	}

	public boolean isSet(quickfix.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(quickfix.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuerLen get(quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(quickfix.field.EncodedLegIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuer get(quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuer());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(quickfix.field.LegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.LegSecurityDesc get(quickfix.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityDesc());
	}

	public boolean isSet(quickfix.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(quickfix.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDescLen get(quickfix.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(quickfix.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDesc get(quickfix.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(quickfix.field.LegRatioQty value) {
		setField(value);
	}

	public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new quickfix.field.LegRatioQty());
	}

	public boolean isSet(quickfix.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(quickfix.field.LegSide value) {
		setField(value);
	}

	public quickfix.field.LegSide get(quickfix.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.field.LegSide());
	}

	public boolean isSet(quickfix.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(quickfix.field.LegCurrency value) {
		setField(value);
	}

	public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegCurrency());
	}

	public boolean isSet(quickfix.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(quickfix.field.LegPool value) {
		setField(value);
	}

	public quickfix.field.LegPool get(quickfix.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPool getLegPool() throws FieldNotFound {
		return get(new quickfix.field.LegPool());
	}

	public boolean isSet(quickfix.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(quickfix.field.LegDatedDate value) {
		setField(value);
	}

	public quickfix.field.LegDatedDate get(quickfix.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new quickfix.field.LegDatedDate());
	}

	public boolean isSet(quickfix.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(quickfix.field.LegContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.LegContractSettlMonth get(quickfix.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.LegContractSettlMonth());
	}

	public boolean isSet(quickfix.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(quickfix.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.LegInterestAccrualDate get(quickfix.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.LegInterestAccrualDate());
	}

	public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	public void set(quickfix.field.LegUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.LegUnitOfMeasure get(quickfix.field.LegUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegUnitOfMeasure getLegUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.LegUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.LegUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetLegUnitOfMeasure() {
		return isSetField(999);
	}

	public void set(quickfix.field.LegTimeUnit value) {
		setField(value);
	}

	public quickfix.field.LegTimeUnit get(quickfix.field.LegTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegTimeUnit getLegTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.LegTimeUnit());
	}

	public boolean isSet(quickfix.field.LegTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetLegTimeUnit() {
		return isSetField(1001);
	}

	public void set(quickfix.field.LegQty value) {
		setField(value);
	}

	public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegQty getLegQty() throws FieldNotFound {
		return get(new quickfix.field.LegQty());
	}

	public boolean isSet(quickfix.field.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(quickfix.field.LegOrderQty value) {
		setField(value);
	}

	public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
		return get(new quickfix.field.LegOrderQty());
	}

	public boolean isSet(quickfix.field.LegOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetLegOrderQty() {
		return isSetField(685);
	}

	public void set(quickfix.field.LegSwapType value) {
		setField(value);
	}

	public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new quickfix.field.LegSwapType());
	}

	public boolean isSet(quickfix.field.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(quickfix.fix50.component.LegStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50.component.LegStipulations get(quickfix.fix50.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new quickfix.fix50.component.LegStipulations());
	}

	public void set(quickfix.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(quickfix.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationType());
	}

	public boolean isSet(quickfix.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(quickfix.field.LegPositionEffect value) {
		setField(value);
	}

	public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.LegPositionEffect());
	}

	public boolean isSet(quickfix.field.LegPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetLegPositionEffect() {
		return isSetField(564);
	}

	public void set(quickfix.field.LegCoveredOrUncovered value) {
		setField(value);
	}

	public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
		return get(new quickfix.field.LegCoveredOrUncovered());
	}

	public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetLegCoveredOrUncovered() {
		return isSetField(565);
	}

	public void set(quickfix.fix50.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.NestedParties get(quickfix.fix50.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.NestedParties());
	}

	public void set(quickfix.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(quickfix.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyID());
	}

	public boolean isSet(quickfix.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.fix50.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.NstdPtysSubGrp get(quickfix.fix50.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.NstdPtysSubGrp());
	}

	public void set(quickfix.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(quickfix.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(quickfix.field.LegRefID value) {
		setField(value);
	}

	public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
		return get(new quickfix.field.LegRefID());
	}

	public boolean isSet(quickfix.field.LegRefID field) {
		return isSetField(field);
	}

	public boolean isSetLegRefID() {
		return isSetField(654);
	}

	public void set(quickfix.field.LegPrice value) {
		setField(value);
	}

	public quickfix.field.LegPrice get(quickfix.field.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPrice getLegPrice() throws FieldNotFound {
		return get(new quickfix.field.LegPrice());
	}

	public boolean isSet(quickfix.field.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(566);
	}

	public void set(quickfix.field.LegSettlType value) {
		setField(value);
	}

	public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new quickfix.field.LegSettlType());
	}

	public boolean isSet(quickfix.field.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(quickfix.field.LegSettlDate value) {
		setField(value);
	}

	public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new quickfix.field.LegSettlDate());
	}

	public boolean isSet(quickfix.field.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(quickfix.field.LegLastPx value) {
		setField(value);
	}

	public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
		return get(new quickfix.field.LegLastPx());
	}

	public boolean isSet(quickfix.field.LegLastPx field) {
		return isSetField(field);
	}

	public boolean isSetLegLastPx() {
		return isSetField(637);
	}

	public void set(quickfix.field.LegSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegSettlCurrency());
	}

	public boolean isSet(quickfix.field.LegSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlCurrency() {
		return isSetField(675);
	}

	public void set(quickfix.field.LegLastForwardPoints value) {
		setField(value);
	}

	public quickfix.field.LegLastForwardPoints get(quickfix.field.LegLastForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastForwardPoints getLegLastForwardPoints() throws FieldNotFound {
		return get(new quickfix.field.LegLastForwardPoints());
	}

	public boolean isSet(quickfix.field.LegLastForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetLegLastForwardPoints() {
		return isSetField(1073);
	}

	public void set(quickfix.field.LegCalculatedCcyLastQty value) {
		setField(value);
	}

	public quickfix.field.LegCalculatedCcyLastQty get(quickfix.field.LegCalculatedCcyLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCalculatedCcyLastQty getLegCalculatedCcyLastQty() throws FieldNotFound {
		return get(new quickfix.field.LegCalculatedCcyLastQty());
	}

	public boolean isSet(quickfix.field.LegCalculatedCcyLastQty field) {
		return isSetField(field);
	}

	public boolean isSetLegCalculatedCcyLastQty() {
		return isSetField(1074);
	}

	public void set(quickfix.field.LegGrossTradeAmt value) {
		setField(value);
	}

	public quickfix.field.LegGrossTradeAmt get(quickfix.field.LegGrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegGrossTradeAmt getLegGrossTradeAmt() throws FieldNotFound {
		return get(new quickfix.field.LegGrossTradeAmt());
	}

	public boolean isSet(quickfix.field.LegGrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetLegGrossTradeAmt() {
		return isSetField(1075);
	}

	}

	public void set(quickfix.field.CopyMsgIndicator value) {
		setField(value);
	}

	public quickfix.field.CopyMsgIndicator get(quickfix.field.CopyMsgIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CopyMsgIndicator getCopyMsgIndicator() throws FieldNotFound {
		return get(new quickfix.field.CopyMsgIndicator());
	}

	public boolean isSet(quickfix.field.CopyMsgIndicator field) {
		return isSetField(field);
	}

	public boolean isSetCopyMsgIndicator() {
		return isSetField(797);
	}

	public void set(quickfix.fix50.component.MiscFeesGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.MiscFeesGrp get(quickfix.fix50.component.MiscFeesGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.MiscFeesGrp getMiscFeesGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.MiscFeesGrp());
	}

	public void set(quickfix.field.NoMiscFees value) {
		setField(value);
	}

	public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new quickfix.field.NoMiscFees());
	}

	public boolean isSet(quickfix.field.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {137, 138, 139, 891, 0};

		public NoMiscFees() {
			super(136, 137, ORDER);
		}
		
	public void set(quickfix.field.MiscFeeAmt value) {
		setField(value);
	}

	public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeAmt());
	}

	public boolean isSet(quickfix.field.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	public void set(quickfix.field.MiscFeeCurr value) {
		setField(value);
	}

	public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeCurr());
	}

	public boolean isSet(quickfix.field.MiscFeeCurr field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeCurr() {
		return isSetField(138);
	}

	public void set(quickfix.field.MiscFeeType value) {
		setField(value);
	}

	public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeType());
	}

	public boolean isSet(quickfix.field.MiscFeeType field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeType() {
		return isSetField(139);
	}

	public void set(quickfix.field.MiscFeeBasis value) {
		setField(value);
	}

	public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeBasis());
	}

	public boolean isSet(quickfix.field.MiscFeeBasis field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeBasis() {
		return isSetField(891);
	}

	}

	public void set(quickfix.fix50.component.StrategyParametersGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.StrategyParametersGrp get(quickfix.fix50.component.StrategyParametersGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.StrategyParametersGrp getStrategyParametersGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.StrategyParametersGrp());
	}

	public void set(quickfix.field.NoStrategyParameters value) {
		setField(value);
	}

	public quickfix.field.NoStrategyParameters get(quickfix.field.NoStrategyParameters value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStrategyParameters getNoStrategyParameters() throws FieldNotFound {
		return get(new quickfix.field.NoStrategyParameters());
	}

	public boolean isSet(quickfix.field.NoStrategyParameters field) {
		return isSetField(field);
	}

	public boolean isSetNoStrategyParameters() {
		return isSetField(957);
	}

	public static class NoStrategyParameters extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {958, 959, 960, 0};

		public NoStrategyParameters() {
			super(957, 958, ORDER);
		}
		
	public void set(quickfix.field.StrategyParameterName value) {
		setField(value);
	}

	public quickfix.field.StrategyParameterName get(quickfix.field.StrategyParameterName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrategyParameterName getStrategyParameterName() throws FieldNotFound {
		return get(new quickfix.field.StrategyParameterName());
	}

	public boolean isSet(quickfix.field.StrategyParameterName field) {
		return isSetField(field);
	}

	public boolean isSetStrategyParameterName() {
		return isSetField(958);
	}

	public void set(quickfix.field.StrategyParameterType value) {
		setField(value);
	}

	public quickfix.field.StrategyParameterType get(quickfix.field.StrategyParameterType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrategyParameterType getStrategyParameterType() throws FieldNotFound {
		return get(new quickfix.field.StrategyParameterType());
	}

	public boolean isSet(quickfix.field.StrategyParameterType field) {
		return isSetField(field);
	}

	public boolean isSetStrategyParameterType() {
		return isSetField(959);
	}

	public void set(quickfix.field.StrategyParameterValue value) {
		setField(value);
	}

	public quickfix.field.StrategyParameterValue get(quickfix.field.StrategyParameterValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrategyParameterValue getStrategyParameterValue() throws FieldNotFound {
		return get(new quickfix.field.StrategyParameterValue());
	}

	public boolean isSet(quickfix.field.StrategyParameterValue field) {
		return isSetField(field);
	}

	public boolean isSetStrategyParameterValue() {
		return isSetField(960);
	}

	}

	public void set(quickfix.field.HostCrossID value) {
		setField(value);
	}

	public quickfix.field.HostCrossID get(quickfix.field.HostCrossID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HostCrossID getHostCrossID() throws FieldNotFound {
		return get(new quickfix.field.HostCrossID());
	}

	public boolean isSet(quickfix.field.HostCrossID field) {
		return isSetField(field);
	}

	public boolean isSetHostCrossID() {
		return isSetField(961);
	}

	public void set(quickfix.field.ManualOrderIndicator value) {
		setField(value);
	}

	public quickfix.field.ManualOrderIndicator get(quickfix.field.ManualOrderIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ManualOrderIndicator getManualOrderIndicator() throws FieldNotFound {
		return get(new quickfix.field.ManualOrderIndicator());
	}

	public boolean isSet(quickfix.field.ManualOrderIndicator field) {
		return isSetField(field);
	}

	public boolean isSetManualOrderIndicator() {
		return isSetField(1028);
	}

	public void set(quickfix.field.CustDirectedOrder value) {
		setField(value);
	}

	public quickfix.field.CustDirectedOrder get(quickfix.field.CustDirectedOrder value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CustDirectedOrder getCustDirectedOrder() throws FieldNotFound {
		return get(new quickfix.field.CustDirectedOrder());
	}

	public boolean isSet(quickfix.field.CustDirectedOrder field) {
		return isSetField(field);
	}

	public boolean isSetCustDirectedOrder() {
		return isSetField(1029);
	}

	public void set(quickfix.field.ReceivedDeptID value) {
		setField(value);
	}

	public quickfix.field.ReceivedDeptID get(quickfix.field.ReceivedDeptID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ReceivedDeptID getReceivedDeptID() throws FieldNotFound {
		return get(new quickfix.field.ReceivedDeptID());
	}

	public boolean isSet(quickfix.field.ReceivedDeptID field) {
		return isSetField(field);
	}

	public boolean isSetReceivedDeptID() {
		return isSetField(1030);
	}

	public void set(quickfix.field.CustOrderHandlingInst value) {
		setField(value);
	}

	public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
		return get(new quickfix.field.CustOrderHandlingInst());
	}

	public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderHandlingInst() {
		return isSetField(1031);
	}

	public void set(quickfix.field.OrderHandlingInstSource value) {
		setField(value);
	}

	public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
		return get(new quickfix.field.OrderHandlingInstSource());
	}

	public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
		return isSetField(field);
	}

	public boolean isSetOrderHandlingInstSource() {
		return isSetField(1032);
	}

	public void set(quickfix.fix50.component.TrdRegTimestamps component) {
		setComponent(component);
	}

	public quickfix.fix50.component.TrdRegTimestamps get(quickfix.fix50.component.TrdRegTimestamps component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.TrdRegTimestamps getTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.fix50.component.TrdRegTimestamps());
	}

	public void set(quickfix.field.NoTrdRegTimestamps value) {
		setField(value);
	}

	public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.field.NoTrdRegTimestamps());
	}

	public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 1033, 1034, 1035, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(quickfix.field.TrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestamp());
	}

	public boolean isSet(quickfix.field.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(quickfix.field.TrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampType());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(quickfix.field.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampOrigin());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	public void set(quickfix.field.DeskType value) {
		setField(value);
	}

	public quickfix.field.DeskType get(quickfix.field.DeskType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskType getDeskType() throws FieldNotFound {
		return get(new quickfix.field.DeskType());
	}

	public boolean isSet(quickfix.field.DeskType field) {
		return isSetField(field);
	}

	public boolean isSetDeskType() {
		return isSetField(1033);
	}

	public void set(quickfix.field.DeskTypeSource value) {
		setField(value);
	}

	public quickfix.field.DeskTypeSource get(quickfix.field.DeskTypeSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskTypeSource getDeskTypeSource() throws FieldNotFound {
		return get(new quickfix.field.DeskTypeSource());
	}

	public boolean isSet(quickfix.field.DeskTypeSource field) {
		return isSetField(field);
	}

	public boolean isSetDeskTypeSource() {
		return isSetField(1034);
	}

	public void set(quickfix.field.DeskOrderHandlingInst value) {
		setField(value);
	}

	public quickfix.field.DeskOrderHandlingInst get(quickfix.field.DeskOrderHandlingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskOrderHandlingInst getDeskOrderHandlingInst() throws FieldNotFound {
		return get(new quickfix.field.DeskOrderHandlingInst());
	}

	public boolean isSet(quickfix.field.DeskOrderHandlingInst field) {
		return isSetField(field);
	}

	public boolean isSetDeskOrderHandlingInst() {
		return isSetField(1035);
	}

	}

	public void set(quickfix.field.AggressorIndicator value) {
		setField(value);
	}

	public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
		return get(new quickfix.field.AggressorIndicator());
	}

	public boolean isSet(quickfix.field.AggressorIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAggressorIndicator() {
		return isSetField(1057);
	}

	public void set(quickfix.field.CalculatedCcyLastQty value) {
		setField(value);
	}

	public quickfix.field.CalculatedCcyLastQty get(quickfix.field.CalculatedCcyLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CalculatedCcyLastQty getCalculatedCcyLastQty() throws FieldNotFound {
		return get(new quickfix.field.CalculatedCcyLastQty());
	}

	public boolean isSet(quickfix.field.CalculatedCcyLastQty field) {
		return isSetField(field);
	}

	public boolean isSetCalculatedCcyLastQty() {
		return isSetField(1056);
	}

	public void set(quickfix.field.LastSwapPoints value) {
		setField(value);
	}

	public quickfix.field.LastSwapPoints get(quickfix.field.LastSwapPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastSwapPoints getLastSwapPoints() throws FieldNotFound {
		return get(new quickfix.field.LastSwapPoints());
	}

	public boolean isSet(quickfix.field.LastSwapPoints field) {
		return isSetField(field);
	}

	public boolean isSetLastSwapPoints() {
		return isSetField(1071);
	}

	public void set(quickfix.field.MatchType value) {
		setField(value);
	}

	public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchType getMatchType() throws FieldNotFound {
		return get(new quickfix.field.MatchType());
	}

	public boolean isSet(quickfix.field.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
	}

	public void set(quickfix.field.OrderCategory value) {
		setField(value);
	}

	public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
		return get(new quickfix.field.OrderCategory());
	}

	public boolean isSet(quickfix.field.OrderCategory field) {
		return isSetField(field);
	}

	public boolean isSetOrderCategory() {
		return isSetField(1115);
	}

	public void set(quickfix.field.LotType value) {
		setField(value);
	}

	public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LotType getLotType() throws FieldNotFound {
		return get(new quickfix.field.LotType());
	}

	public boolean isSet(quickfix.field.LotType field) {
		return isSetField(field);
	}

	public boolean isSetLotType() {
		return isSetField(1093);
	}

	public void set(quickfix.field.PriceProtectionScope value) {
		setField(value);
	}

	public quickfix.field.PriceProtectionScope get(quickfix.field.PriceProtectionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceProtectionScope getPriceProtectionScope() throws FieldNotFound {
		return get(new quickfix.field.PriceProtectionScope());
	}

	public boolean isSet(quickfix.field.PriceProtectionScope field) {
		return isSetField(field);
	}

	public boolean isSetPriceProtectionScope() {
		return isSetField(1092);
	}

	public void set(quickfix.fix50.component.TriggeringInstruction component) {
		setComponent(component);
	}

	public quickfix.fix50.component.TriggeringInstruction get(quickfix.fix50.component.TriggeringInstruction component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.TriggeringInstruction getTriggeringInstruction() throws FieldNotFound {
		return get(new quickfix.fix50.component.TriggeringInstruction());
	}

	public void set(quickfix.field.TriggerType value) {
		setField(value);
	}

	public quickfix.field.TriggerType get(quickfix.field.TriggerType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerType getTriggerType() throws FieldNotFound {
		return get(new quickfix.field.TriggerType());
	}

	public boolean isSet(quickfix.field.TriggerType field) {
		return isSetField(field);
	}

	public boolean isSetTriggerType() {
		return isSetField(1100);
	}

	public void set(quickfix.field.TriggerAction value) {
		setField(value);
	}

	public quickfix.field.TriggerAction get(quickfix.field.TriggerAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerAction getTriggerAction() throws FieldNotFound {
		return get(new quickfix.field.TriggerAction());
	}

	public boolean isSet(quickfix.field.TriggerAction field) {
		return isSetField(field);
	}

	public boolean isSetTriggerAction() {
		return isSetField(1101);
	}

	public void set(quickfix.field.TriggerPrice value) {
		setField(value);
	}

	public quickfix.field.TriggerPrice get(quickfix.field.TriggerPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerPrice getTriggerPrice() throws FieldNotFound {
		return get(new quickfix.field.TriggerPrice());
	}

	public boolean isSet(quickfix.field.TriggerPrice field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPrice() {
		return isSetField(1102);
	}

	public void set(quickfix.field.TriggerSymbol value) {
		setField(value);
	}

	public quickfix.field.TriggerSymbol get(quickfix.field.TriggerSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerSymbol getTriggerSymbol() throws FieldNotFound {
		return get(new quickfix.field.TriggerSymbol());
	}

	public boolean isSet(quickfix.field.TriggerSymbol field) {
		return isSetField(field);
	}

	public boolean isSetTriggerSymbol() {
		return isSetField(1103);
	}

	public void set(quickfix.field.TriggerSecurityID value) {
		setField(value);
	}

	public quickfix.field.TriggerSecurityID get(quickfix.field.TriggerSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerSecurityID getTriggerSecurityID() throws FieldNotFound {
		return get(new quickfix.field.TriggerSecurityID());
	}

	public boolean isSet(quickfix.field.TriggerSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetTriggerSecurityID() {
		return isSetField(1104);
	}

	public void set(quickfix.field.TriggerSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.TriggerSecurityIDSource get(quickfix.field.TriggerSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerSecurityIDSource getTriggerSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.TriggerSecurityIDSource());
	}

	public boolean isSet(quickfix.field.TriggerSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetTriggerSecurityIDSource() {
		return isSetField(1105);
	}

	public void set(quickfix.field.TriggerSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.TriggerSecurityDesc get(quickfix.field.TriggerSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerSecurityDesc getTriggerSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.TriggerSecurityDesc());
	}

	public boolean isSet(quickfix.field.TriggerSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetTriggerSecurityDesc() {
		return isSetField(1106);
	}

	public void set(quickfix.field.TriggerPriceType value) {
		setField(value);
	}

	public quickfix.field.TriggerPriceType get(quickfix.field.TriggerPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerPriceType getTriggerPriceType() throws FieldNotFound {
		return get(new quickfix.field.TriggerPriceType());
	}

	public boolean isSet(quickfix.field.TriggerPriceType field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPriceType() {
		return isSetField(1107);
	}

	public void set(quickfix.field.TriggerPriceTypeScope value) {
		setField(value);
	}

	public quickfix.field.TriggerPriceTypeScope get(quickfix.field.TriggerPriceTypeScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerPriceTypeScope getTriggerPriceTypeScope() throws FieldNotFound {
		return get(new quickfix.field.TriggerPriceTypeScope());
	}

	public boolean isSet(quickfix.field.TriggerPriceTypeScope field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPriceTypeScope() {
		return isSetField(1108);
	}

	public void set(quickfix.field.TriggerPriceDirection value) {
		setField(value);
	}

	public quickfix.field.TriggerPriceDirection get(quickfix.field.TriggerPriceDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerPriceDirection getTriggerPriceDirection() throws FieldNotFound {
		return get(new quickfix.field.TriggerPriceDirection());
	}

	public boolean isSet(quickfix.field.TriggerPriceDirection field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPriceDirection() {
		return isSetField(1109);
	}

	public void set(quickfix.field.TriggerNewPrice value) {
		setField(value);
	}

	public quickfix.field.TriggerNewPrice get(quickfix.field.TriggerNewPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerNewPrice getTriggerNewPrice() throws FieldNotFound {
		return get(new quickfix.field.TriggerNewPrice());
	}

	public boolean isSet(quickfix.field.TriggerNewPrice field) {
		return isSetField(field);
	}

	public boolean isSetTriggerNewPrice() {
		return isSetField(1110);
	}

	public void set(quickfix.field.TriggerOrderType value) {
		setField(value);
	}

	public quickfix.field.TriggerOrderType get(quickfix.field.TriggerOrderType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerOrderType getTriggerOrderType() throws FieldNotFound {
		return get(new quickfix.field.TriggerOrderType());
	}

	public boolean isSet(quickfix.field.TriggerOrderType field) {
		return isSetField(field);
	}

	public boolean isSetTriggerOrderType() {
		return isSetField(1111);
	}

	public void set(quickfix.field.TriggerNewQty value) {
		setField(value);
	}

	public quickfix.field.TriggerNewQty get(quickfix.field.TriggerNewQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerNewQty getTriggerNewQty() throws FieldNotFound {
		return get(new quickfix.field.TriggerNewQty());
	}

	public boolean isSet(quickfix.field.TriggerNewQty field) {
		return isSetField(field);
	}

	public boolean isSetTriggerNewQty() {
		return isSetField(1112);
	}

	public void set(quickfix.field.TriggerTradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TriggerTradingSessionID get(quickfix.field.TriggerTradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerTradingSessionID getTriggerTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TriggerTradingSessionID());
	}

	public boolean isSet(quickfix.field.TriggerTradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTriggerTradingSessionID() {
		return isSetField(1113);
	}

	public void set(quickfix.field.TriggerTradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.TriggerTradingSessionSubID get(quickfix.field.TriggerTradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TriggerTradingSessionSubID getTriggerTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.TriggerTradingSessionSubID());
	}

	public boolean isSet(quickfix.field.TriggerTradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTriggerTradingSessionSubID() {
		return isSetField(1114);
	}

	public void set(quickfix.field.PeggedRefPrice value) {
		setField(value);
	}

	public quickfix.field.PeggedRefPrice get(quickfix.field.PeggedRefPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PeggedRefPrice getPeggedRefPrice() throws FieldNotFound {
		return get(new quickfix.field.PeggedRefPrice());
	}

	public boolean isSet(quickfix.field.PeggedRefPrice field) {
		return isSetField(field);
	}

	public boolean isSetPeggedRefPrice() {
		return isSetField(1095);
	}

	public void set(quickfix.field.PreTradeAnonymity value) {
		setField(value);
	}

	public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
		return get(new quickfix.field.PreTradeAnonymity());
	}

	public boolean isSet(quickfix.field.PreTradeAnonymity field) {
		return isSetField(field);
	}

	public boolean isSetPreTradeAnonymity() {
		return isSetField(1091);
	}

	public void set(quickfix.field.MatchIncrement value) {
		setField(value);
	}

	public quickfix.field.MatchIncrement get(quickfix.field.MatchIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchIncrement getMatchIncrement() throws FieldNotFound {
		return get(new quickfix.field.MatchIncrement());
	}

	public boolean isSet(quickfix.field.MatchIncrement field) {
		return isSetField(field);
	}

	public boolean isSetMatchIncrement() {
		return isSetField(1089);
	}

	public void set(quickfix.field.MaxPriceLevels value) {
		setField(value);
	}

	public quickfix.field.MaxPriceLevels get(quickfix.field.MaxPriceLevels value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxPriceLevels getMaxPriceLevels() throws FieldNotFound {
		return get(new quickfix.field.MaxPriceLevels());
	}

	public boolean isSet(quickfix.field.MaxPriceLevels field) {
		return isSetField(field);
	}

	public boolean isSetMaxPriceLevels() {
		return isSetField(1090);
	}

	public void set(quickfix.fix50.component.DisplayInstruction component) {
		setComponent(component);
	}

	public quickfix.fix50.component.DisplayInstruction get(quickfix.fix50.component.DisplayInstruction component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.DisplayInstruction getDisplayInstruction() throws FieldNotFound {
		return get(new quickfix.fix50.component.DisplayInstruction());
	}

	public void set(quickfix.field.SecondaryDisplayQty value) {
		setField(value);
	}

	public quickfix.field.SecondaryDisplayQty get(quickfix.field.SecondaryDisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryDisplayQty getSecondaryDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.SecondaryDisplayQty());
	}

	public boolean isSet(quickfix.field.SecondaryDisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryDisplayQty() {
		return isSetField(1082);
	}

	public void set(quickfix.field.DisplayWhen value) {
		setField(value);
	}

	public quickfix.field.DisplayWhen get(quickfix.field.DisplayWhen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayWhen getDisplayWhen() throws FieldNotFound {
		return get(new quickfix.field.DisplayWhen());
	}

	public boolean isSet(quickfix.field.DisplayWhen field) {
		return isSetField(field);
	}

	public boolean isSetDisplayWhen() {
		return isSetField(1083);
	}

	public void set(quickfix.field.DisplayMethod value) {
		setField(value);
	}

	public quickfix.field.DisplayMethod get(quickfix.field.DisplayMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMethod getDisplayMethod() throws FieldNotFound {
		return get(new quickfix.field.DisplayMethod());
	}

	public boolean isSet(quickfix.field.DisplayMethod field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMethod() {
		return isSetField(1084);
	}

	public void set(quickfix.field.DisplayLowQty value) {
		setField(value);
	}

	public quickfix.field.DisplayLowQty get(quickfix.field.DisplayLowQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayLowQty getDisplayLowQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayLowQty());
	}

	public boolean isSet(quickfix.field.DisplayLowQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayLowQty() {
		return isSetField(1085);
	}

	public void set(quickfix.field.DisplayHighQty value) {
		setField(value);
	}

	public quickfix.field.DisplayHighQty get(quickfix.field.DisplayHighQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayHighQty getDisplayHighQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayHighQty());
	}

	public boolean isSet(quickfix.field.DisplayHighQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayHighQty() {
		return isSetField(1086);
	}

	public void set(quickfix.field.DisplayMinIncr value) {
		setField(value);
	}

	public quickfix.field.DisplayMinIncr get(quickfix.field.DisplayMinIncr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMinIncr getDisplayMinIncr() throws FieldNotFound {
		return get(new quickfix.field.DisplayMinIncr());
	}

	public boolean isSet(quickfix.field.DisplayMinIncr field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMinIncr() {
		return isSetField(1087);
	}

	public void set(quickfix.field.RefreshQty value) {
		setField(value);
	}

	public quickfix.field.RefreshQty get(quickfix.field.RefreshQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefreshQty getRefreshQty() throws FieldNotFound {
		return get(new quickfix.field.RefreshQty());
	}

	public boolean isSet(quickfix.field.RefreshQty field) {
		return isSetField(field);
	}

	public boolean isSetRefreshQty() {
		return isSetField(1088);
	}

	public void set(quickfix.field.DisplayQty value) {
		setField(value);
	}

	public quickfix.field.DisplayQty get(quickfix.field.DisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayQty getDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayQty());
	}

	public boolean isSet(quickfix.field.DisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayQty() {
		return isSetField(1138);
	}

}
