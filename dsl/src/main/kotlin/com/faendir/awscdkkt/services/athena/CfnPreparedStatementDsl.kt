@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
