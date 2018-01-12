import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import javax.transaction.xa.XAResource;

import oracle.jdbc.OracleOCIFailover;
import oracle.jdbc.OracleSavepoint;
import oracle.jdbc.internal.OracleConnection;
import oracle.jdbc.internal.OracleStatement;
import oracle.jdbc.oracore.OracleTypeADT;
import oracle.jdbc.oracore.OracleTypeCLOB;
import oracle.jdbc.pool.OracleConnectionCacheCallback;
import oracle.jdbc.pool.OraclePooledConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.BFILE;
import oracle.sql.BLOB;
import oracle.sql.BfileDBAccess;
import oracle.sql.BlobDBAccess;
import oracle.sql.CLOB;
import oracle.sql.ClobDBAccess;
import oracle.sql.CustomDatum;
import oracle.sql.Datum;
import oracle.sql.StructDescriptor;

public class FakeOracleConnetion implements OracleConnection {

	@Override
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTypeMap(Map paramMap) throws SQLException {
		// TODO Auto-generated method stub
	}

	@Override
	public PreparedStatement prepareStatement(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nativeSQL(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAutoCommit(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void commit() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReadOnly(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCatalog(String paramString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCatalog() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransactionIsolation(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Statement createStatement(int paramInt1, int paramInt2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String paramString, int paramInt1, int paramInt2)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String paramString, int paramInt1, int paramInt2)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setHoldability(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Savepoint setSavepoint(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rollback(Savepoint paramSavepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void releaseSavepoint(Savepoint paramSavepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Statement createStatement(int paramInt1, int paramInt2, int paramInt3)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String paramString, int paramInt1, int paramInt2,
			int paramInt3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String paramString, int paramInt1, int paramInt2,
			int paramInt3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String paramString, int paramInt) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String paramString, int[] paramArrayOfInt)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String paramString, String[] paramArrayOfString)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(int paramInt) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClientInfo(String paramString1, String paramString2)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setClientInfo(Properties paramProperties) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClientInfo(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array createArrayOf(String paramString, Object[] paramArrayOfObject) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Struct createStruct(String paramString, Object[] paramArrayOfObject) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSchema(String paramString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort(Executor paramExecutor) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNetworkTimeout(Executor paramExecutor, int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> T unwrap(Class<T> paramClass) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> paramClass) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void archive(int paramInt1, int paramInt2, String paramString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void openProxySession(int paramInt, Properties paramProperties) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getAutoClose() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDefaultExecuteBatch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDefaultRowPrefetch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getDescriptor(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getEndToEndMetrics() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public short getEndToEndECIDSequenceNumber() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getIncludeSynonyms() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getRestrictGetTables() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getJavaObject(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getRemarksReporting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSQLType(Object paramObject) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStmtCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short getStructAttrCsId() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUserName() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getUsingXAFlag() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getXAErrorFlag() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int pingDatabase(int paramInt) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void putDescriptor(String paramString, Object paramObject) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerSQLType(String paramString, Class paramClass) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerSQLType(String paramString1, String paramString2) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAutoClose(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefaultExecuteBatch(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefaultRowPrefetch(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEndToEndMetrics(String[] paramArrayOfString, short paramShort)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIncludeSynonyms(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRemarksReporting(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRestrictGetTables(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStmtCacheSize(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStmtCacheSize(int paramInt, boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStatementCacheSize(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getStatementCacheSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setImplicitCachingEnabled(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getImplicitCachingEnabled() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setExplicitCachingEnabled(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getExplicitCachingEnabled() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void purgeImplicitCache() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void purgeExplicitCache() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public PreparedStatement getStatementWithKey(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement getCallWithKey(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsingXAFlag(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setXAErrorFlag(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdown(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void startup(String paramString, int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public PreparedStatement prepareStatementWithKey(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCallWithKey(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreateStatementAsRefCursor(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getCreateStatementAsRefCursor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSessionTimeZone(String paramString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSessionTimeZone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection _getPC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLogicalConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerTAFCallback(OracleOCIFailover paramOracleOCIFailover, Object paramObject)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public OracleConnection unwrap() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setWrapper(OracleConnection paramOracleConnection) {
		// TODO Auto-generated method stub

	}

	@Override
	public oracle.jdbc.internal.OracleConnection physicalConnectionWithin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OracleSavepoint oracleSetSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OracleSavepoint oracleSetSavepoint(String paramString) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void oracleRollback(OracleSavepoint paramOracleSavepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void oracleReleaseSavepoint(OracleSavepoint paramOracleSavepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close(Properties paramProperties) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isProxySession() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void applyConnectionAttributes(Properties paramProperties) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Properties getConnectionAttributes() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getUnMatchedConnectionAttributes() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerConnectionCacheCallback(
			OracleConnectionCacheCallback paramOracleConnectionCacheCallback, Object paramObject,
			int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setConnectionReleasePriority(int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getConnectionReleasePriority() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPlsqlWarnings(String paramString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWrapper(oracle.jdbc.OracleConnection paramOracleConnection) {
		// TODO Auto-generated method stub

	}

	@Override
	public short getStructAttrNCsId() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Properties getDBAccessProperties() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getOCIHandles() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatabaseProductVersion() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancel() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getURL() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trace(String paramString) {
		// TODO Auto-generated method stub

	}

	@Override
	public short getVersionNumber() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map getJavaObjectTypeMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJavaObjectTypeMap(Map paramMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public BfileDBAccess createBfileDBAccess() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlobDBAccess createBlobDBAccess() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClobDBAccess createClobDBAccess() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultFixedString(boolean paramBoolean) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getDefaultFixedString() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public oracle.jdbc.OracleConnection getWrapper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class classForNameAndSchema(String paramString1, String paramString2)
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFDO(byte[] paramArrayOfByte) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] getFDO(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getBigEndian() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getDescriptor(byte[] paramArrayOfByte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putDescriptor(byte[] paramArrayOfByte, Object paramObject) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public OracleConnection getPhysicalConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeDescriptor(String paramString) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAllDescriptor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getOracleTypeADT(OracleTypeADT paramOracleTypeADT) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Datum toDatum(CustomDatum paramCustomDatum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public short getDbCsId() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short getJdbcCsId() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short getNCharSet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet newArrayDataResultSet(Datum[] paramArrayOfDatum, long paramLong, int paramInt,
			Map paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet newArrayDataResultSet(ARRAY paramARRAY, long paramLong, int paramInt,
			Map paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet newArrayLocatorResultSet(ArrayDescriptor paramArrayDescriptor,
			byte[] paramArrayOfByte, long paramLong, int paramInt, Map paramMap)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSetMetaData newStructMetaData(StructDescriptor paramStructDescriptor)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getForm(OracleTypeADT paramOracleTypeADT, OracleTypeCLOB paramOracleTypeCLOB,
			int paramInt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int CHARBytesToJavaChars(byte[] paramArrayOfByte, int paramInt, char[] paramArrayOfChar)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int NCHARBytesToJavaChars(byte[] paramArrayOfByte, int paramInt, char[] paramArrayOfChar)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean IsNCharFixedWith() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public short getDriverCharSet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getC2SNlsRatio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxCharSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxCharbyteSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxNCharbyteSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCharSetMultibyte(short paramShort) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int javaCharsToCHARBytes(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int javaCharsToNCHARBytes(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStartTime(long paramLong) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public long getStartTime() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isStatementCacheInitialized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getPropertyForPooledConnection(OraclePooledConnection paramOraclePooledConnection)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getProtocolType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getLogicalConnection(OraclePooledConnection paramOraclePooledConnection,
			boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTxnMode(int paramInt) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTxnMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeapAllocSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getOCIEnvHeapAllocSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAbandonedTimeoutEnabled(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getHeartbeatNoChangeCount() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void closeInternal(boolean paramBoolean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public OracleConnectionCacheCallback getConnectionCacheCallbackObj() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getConnectionCacheCallbackPrivObj() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getConnectionCacheCallbackFlag() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CLOB createClob(byte[] paramArrayOfByte) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CLOB createClob(byte[] paramArrayOfByte, short paramShort) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BLOB createBlob(byte[] paramArrayOfByte) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BFILE createBfile(byte[] paramArrayOfByte) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDescriptorSharable(OracleConnection paramOracleConnection) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isV8Compatible() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OracleStatement refCursorCursorToStatement(int paramInt) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public XAResource getXAResource() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
