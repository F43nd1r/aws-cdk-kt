package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPreparedStatement(
  id: String,
  props: CfnPreparedStatementProps,
  initializer: @AwsCdkDsl CfnPreparedStatement.() -> Unit = {},
): CfnPreparedStatement = CfnPreparedStatement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPreparedStatement(id: String, initializer: @AwsCdkDsl
    CfnPreparedStatement.Builder.() -> Unit = {}): CfnPreparedStatement =
    CfnPreparedStatement.Builder.create(this, id).apply(initializer).build()
