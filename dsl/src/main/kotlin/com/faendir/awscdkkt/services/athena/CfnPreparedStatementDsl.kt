@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps
import software.constructs.Construct

public fun Construct.cfnPreparedStatement(
  id: String,
  props: CfnPreparedStatementProps,
  initializer: CfnPreparedStatement.() -> Unit = {},
): CfnPreparedStatement = CfnPreparedStatement(this, id, props).apply(initializer)
