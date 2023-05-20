@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import software.constructs.Construct

public fun Construct.cfnStackUserAssociation(
  id: String,
  props: CfnStackUserAssociationProps,
  initializer: CfnStackUserAssociation.() -> Unit = {},
): CfnStackUserAssociation = CfnStackUserAssociation(this, id, props).apply(initializer)
