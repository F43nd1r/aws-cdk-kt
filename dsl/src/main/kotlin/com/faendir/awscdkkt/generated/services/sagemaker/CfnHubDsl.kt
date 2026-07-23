package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnHub
import software.amazon.awscdk.services.sagemaker.CfnHubProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHub(
  id: String,
  props: CfnHubProps,
  initializer: @AwsCdkDsl CfnHub.() -> Unit = {},
): CfnHub = CfnHub(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHub(id: String, initializer: @AwsCdkDsl CfnHub.Builder.() -> Unit = {}): CfnHub = CfnHub.Builder.create(this, id).apply(initializer).build()
