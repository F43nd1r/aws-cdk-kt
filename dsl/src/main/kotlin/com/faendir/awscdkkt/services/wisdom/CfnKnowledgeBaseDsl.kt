@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
import software.constructs.Construct

public fun Construct.cfnKnowledgeBase(
  id: String,
  props: CfnKnowledgeBaseProps,
  initializer: CfnKnowledgeBase.() -> Unit = {},
): CfnKnowledgeBase = CfnKnowledgeBase(this, id, props).apply(initializer)
