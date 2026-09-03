package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnTopicV2
import software.amazon.awscdk.services.quicksight.CfnTopicV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicV2(id: String, initializer: @AwsCdkDsl CfnTopicV2.() -> Unit = {}): CfnTopicV2 = CfnTopicV2(this, id).apply(initializer)

@Generated
public fun Construct.cfnTopicV2(
  id: String,
  props: CfnTopicV2Props,
  initializer: @AwsCdkDsl CfnTopicV2.() -> Unit = {},
): CfnTopicV2 = CfnTopicV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopicV2(id: String, initializer: @AwsCdkDsl CfnTopicV2.Builder.() -> Unit = {}): CfnTopicV2 = CfnTopicV2.Builder.create(this, id).apply(initializer).build()
