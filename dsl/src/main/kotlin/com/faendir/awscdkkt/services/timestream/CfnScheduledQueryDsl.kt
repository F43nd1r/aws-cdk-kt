package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnScheduledQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduledQuery(
  id: String,
  props: CfnScheduledQueryProps,
  initializer: CfnScheduledQuery.() -> Unit = {},
): CfnScheduledQuery = CfnScheduledQuery(this, id, props).apply(initializer)
