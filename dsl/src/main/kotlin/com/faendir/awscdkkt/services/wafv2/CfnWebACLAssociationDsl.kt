@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
import software.constructs.Construct

public fun Construct.cfnWebACLAssociation(
  id: String,
  props: CfnWebACLAssociationProps,
  initializer: CfnWebACLAssociation.() -> Unit = {},
): CfnWebACLAssociation = CfnWebACLAssociation(this, id, props).apply(initializer)
