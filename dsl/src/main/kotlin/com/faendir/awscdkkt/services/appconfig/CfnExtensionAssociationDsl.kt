package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExtensionAssociation(id: String,
    initializer: CfnExtensionAssociation.() -> Unit = {}): CfnExtensionAssociation =
    CfnExtensionAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnExtensionAssociation(
  id: String,
  props: CfnExtensionAssociationProps,
  initializer: CfnExtensionAssociation.() -> Unit = {},
): CfnExtensionAssociation = CfnExtensionAssociation(this, id, props).apply(initializer)
