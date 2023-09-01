package com.faendir.awscdkkt.generated.services.panorama

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationInstance(
  id: String,
  props: CfnApplicationInstanceProps,
  initializer: @AwsCdkDsl CfnApplicationInstance.() -> Unit = {},
): CfnApplicationInstance = CfnApplicationInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationInstance(id: String, initializer: @AwsCdkDsl
    CfnApplicationInstance.Builder.() -> Unit = {}): CfnApplicationInstance =
    CfnApplicationInstance.Builder.create(this, id).apply(initializer).build()
