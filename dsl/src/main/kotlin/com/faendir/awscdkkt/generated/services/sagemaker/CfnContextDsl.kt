package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnContext
import software.amazon.awscdk.services.sagemaker.CfnContextProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContext(
  id: String,
  props: CfnContextProps,
  initializer: @AwsCdkDsl CfnContext.() -> Unit = {},
): CfnContext = CfnContext(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContext(id: String, initializer: @AwsCdkDsl CfnContext.Builder.() -> Unit = {}): CfnContext = CfnContext.Builder.create(this, id).apply(initializer).build()
