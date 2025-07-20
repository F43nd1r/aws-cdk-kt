package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelCard(
  id: String,
  props: CfnModelCardProps,
  initializer: @AwsCdkDsl CfnModelCard.() -> Unit = {},
): CfnModelCard = CfnModelCard(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelCard(id: String, initializer: @AwsCdkDsl CfnModelCard.Builder.() -> Unit = {}): CfnModelCard = CfnModelCard.Builder.create(this, id).apply(initializer).build()
