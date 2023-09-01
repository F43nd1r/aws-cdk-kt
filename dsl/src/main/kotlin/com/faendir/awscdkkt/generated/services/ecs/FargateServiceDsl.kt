package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.fargateService(
  id: String,
  props: FargateServiceProps,
  initializer: @AwsCdkDsl FargateService.() -> Unit = {},
): FargateService = FargateService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateService(id: String, initializer: @AwsCdkDsl
    FargateService.Builder.() -> Unit = {}): FargateService = FargateService.Builder.create(this,
    id).apply(initializer).build()
