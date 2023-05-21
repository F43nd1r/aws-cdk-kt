package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssistantAssociation(
  id: String,
  props: CfnAssistantAssociationProps,
  initializer: CfnAssistantAssociation.() -> Unit = {},
): CfnAssistantAssociation = CfnAssistantAssociation(this, id, props).apply(initializer)
