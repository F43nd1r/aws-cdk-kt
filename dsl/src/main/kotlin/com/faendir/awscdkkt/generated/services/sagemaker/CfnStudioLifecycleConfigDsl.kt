package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudioLifecycleConfig(
  id: String,
  props: CfnStudioLifecycleConfigProps,
  initializer: @AwsCdkDsl CfnStudioLifecycleConfig.() -> Unit = {},
): CfnStudioLifecycleConfig = CfnStudioLifecycleConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStudioLifecycleConfig(id: String, initializer: @AwsCdkDsl CfnStudioLifecycleConfig.Builder.() -> Unit = {}): CfnStudioLifecycleConfig = CfnStudioLifecycleConfig.Builder.create(this, id).apply(initializer).build()
