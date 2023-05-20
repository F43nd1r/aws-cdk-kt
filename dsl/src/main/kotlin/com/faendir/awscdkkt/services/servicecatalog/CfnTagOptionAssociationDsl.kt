@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
