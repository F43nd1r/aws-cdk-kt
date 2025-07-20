package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteServerPropagation
import software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteServerPropagation(
  id: String,
  props: CfnRouteServerPropagationProps,
  initializer: @AwsCdkDsl CfnRouteServerPropagation.() -> Unit = {},
): CfnRouteServerPropagation = CfnRouteServerPropagation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteServerPropagation(id: String, initializer: @AwsCdkDsl CfnRouteServerPropagation.Builder.() -> Unit = {}): CfnRouteServerPropagation = CfnRouteServerPropagation.Builder.create(this, id).apply(initializer).build()
