package com.faendir.awscdkkt.generated.services.nimblestudio

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudio(
  id: String,
  props: CfnStudioProps,
  initializer: @AwsCdkDsl CfnStudio.() -> Unit = {},
): CfnStudio = CfnStudio(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStudio(id: String, initializer: @AwsCdkDsl CfnStudio.Builder.() -> Unit = {}): CfnStudio = CfnStudio.Builder.create(this, id).apply(initializer).build()
