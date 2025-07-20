package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContainer(
  id: String,
  props: CfnContainerProps,
  initializer: @AwsCdkDsl CfnContainer.() -> Unit = {},
): CfnContainer = CfnContainer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContainer(id: String, initializer: @AwsCdkDsl CfnContainer.Builder.() -> Unit = {}): CfnContainer = CfnContainer.Builder.create(this, id).apply(initializer).build()
