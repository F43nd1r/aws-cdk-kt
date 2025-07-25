package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKnowledgeBase(
  id: String,
  props: CfnKnowledgeBaseProps,
  initializer: @AwsCdkDsl CfnKnowledgeBase.() -> Unit = {},
): CfnKnowledgeBase = CfnKnowledgeBase(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKnowledgeBase(id: String, initializer: @AwsCdkDsl CfnKnowledgeBase.Builder.() -> Unit = {}): CfnKnowledgeBase = CfnKnowledgeBase.Builder.create(this, id).apply(initializer).build()
