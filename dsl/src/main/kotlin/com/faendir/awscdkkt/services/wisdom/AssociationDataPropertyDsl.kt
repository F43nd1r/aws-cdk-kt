package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation

@Generated
public
    fun associationDataProperty(initializer: CfnAssistantAssociation.AssociationDataProperty.Builder.() -> Unit
    = {}): CfnAssistantAssociation.AssociationDataProperty =
    CfnAssistantAssociation.AssociationDataProperty.builder().apply(initializer).build()
