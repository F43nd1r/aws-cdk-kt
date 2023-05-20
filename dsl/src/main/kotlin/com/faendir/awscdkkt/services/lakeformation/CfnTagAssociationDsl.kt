@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
import software.constructs.Construct

public fun Construct.cfnTagAssociation(
  id: String,
  props: CfnTagAssociationProps,
  initializer: CfnTagAssociation.() -> Unit = {},
): CfnTagAssociation = CfnTagAssociation(this, id, props).apply(initializer)
