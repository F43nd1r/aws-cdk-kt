@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
import software.constructs.Construct

public fun Construct.cfnTagOptionAssociation(
  id: String,
  props: CfnTagOptionAssociationProps,
  initializer: CfnTagOptionAssociation.() -> Unit = {},
): CfnTagOptionAssociation = CfnTagOptionAssociation(this, id, props).apply(initializer)
