package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAggregationAuthorization(id: String,
    props: CfnAggregationAuthorizationProps): CfnAggregationAuthorization =
    CfnAggregationAuthorization(this, id, props)

@Generated
public fun Construct.cfnAggregationAuthorization(
  id: String,
  props: CfnAggregationAuthorizationProps,
  initializer: @AwsCdkDsl CfnAggregationAuthorization.() -> Unit,
): CfnAggregationAuthorization = CfnAggregationAuthorization(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAggregationAuthorization(id: String, initializer: @AwsCdkDsl
    CfnAggregationAuthorization.Builder.() -> Unit): CfnAggregationAuthorization =
    CfnAggregationAuthorization.Builder.create(this, id).apply(initializer).build()
