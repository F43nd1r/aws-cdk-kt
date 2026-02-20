package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnScheduledQuery
import software.amazon.awscdk.services.logs.CfnScheduledQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduledQuery(
  id: String,
  props: CfnScheduledQueryProps,
  initializer: @AwsCdkDsl CfnScheduledQuery.() -> Unit = {},
): CfnScheduledQuery = CfnScheduledQuery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScheduledQuery(id: String, initializer: @AwsCdkDsl CfnScheduledQuery.Builder.() -> Unit = {}): CfnScheduledQuery = CfnScheduledQuery.Builder.create(this, id).apply(initializer).build()
