@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
import software.constructs.Construct

public fun Construct.cfnExtensionAssociation(id: String,
    initializer: CfnExtensionAssociation.() -> Unit = {}): CfnExtensionAssociation =
    CfnExtensionAssociation(this, id).apply(initializer)

public fun Construct.cfnExtensionAssociation(
  id: String,
  props: CfnExtensionAssociationProps,
  initializer: CfnExtensionAssociation.() -> Unit = {},
): CfnExtensionAssociation = CfnExtensionAssociation(this, id, props).apply(initializer)
