@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnScheduledQueryProps
import software.constructs.Construct

public fun Construct.cfnScheduledQuery(
  id: String,
  props: CfnScheduledQueryProps,
  initializer: CfnScheduledQuery.() -> Unit = {},
): CfnScheduledQuery = CfnScheduledQuery(this, id, props).apply(initializer)
