package com.faendir.awscdkkt.generated.services.nimblestudio

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudioComponent(
  id: String,
  props: CfnStudioComponentProps,
  initializer: @AwsCdkDsl CfnStudioComponent.() -> Unit = {},
): CfnStudioComponent = CfnStudioComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStudioComponent(id: String, initializer: @AwsCdkDsl
    CfnStudioComponent.Builder.() -> Unit = {}): CfnStudioComponent =
    CfnStudioComponent.Builder.create(this, id).apply(initializer).build()
