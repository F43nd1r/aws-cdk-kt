package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAlgorithm
import software.amazon.awscdk.services.sagemaker.CfnAlgorithmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlgorithm(
  id: String,
  props: CfnAlgorithmProps,
  initializer: @AwsCdkDsl CfnAlgorithm.() -> Unit = {},
): CfnAlgorithm = CfnAlgorithm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlgorithm(id: String, initializer: @AwsCdkDsl CfnAlgorithm.Builder.() -> Unit = {}): CfnAlgorithm = CfnAlgorithm.Builder.create(this, id).apply(initializer).build()
