package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnTopic
import software.amazon.awscdk.services.msk.CfnTopicProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopic(
  id: String,
  props: CfnTopicProps,
  initializer: @AwsCdkDsl CfnTopic.() -> Unit = {},
): CfnTopic = CfnTopic(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopic(id: String, initializer: @AwsCdkDsl CfnTopic.Builder.() -> Unit = {}): CfnTopic = CfnTopic.Builder.create(this, id).apply(initializer).build()
