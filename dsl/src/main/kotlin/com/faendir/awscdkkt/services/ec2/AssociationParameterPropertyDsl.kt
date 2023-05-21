package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

@Generated
public
    fun associationParameterProperty(initializer: CfnInstance.AssociationParameterProperty.Builder.() -> Unit
    = {}): CfnInstance.AssociationParameterProperty =
    CfnInstance.AssociationParameterProperty.builder().apply(initializer).build()
