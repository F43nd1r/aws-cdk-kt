package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.amazon.awscdk.services.cloudformation.CfnPublisherProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublisher(
  id: String,
  props: CfnPublisherProps,
  initializer: @AwsCdkDsl CfnPublisher.() -> Unit = {},
): CfnPublisher = CfnPublisher(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublisher(id: String, initializer: @AwsCdkDsl CfnPublisher.Builder.() -> Unit = {}): CfnPublisher = CfnPublisher.Builder.create(this, id).apply(initializer).build()
