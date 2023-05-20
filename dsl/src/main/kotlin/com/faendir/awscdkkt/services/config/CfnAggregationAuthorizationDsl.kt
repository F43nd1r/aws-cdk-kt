@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
import software.constructs.Construct

public fun Construct.cfnAggregationAuthorization(
  id: String,
  props: CfnAggregationAuthorizationProps,
  initializer: CfnAggregationAuthorization.() -> Unit = {},
): CfnAggregationAuthorization = CfnAggregationAuthorization(this, id, props).apply(initializer)
