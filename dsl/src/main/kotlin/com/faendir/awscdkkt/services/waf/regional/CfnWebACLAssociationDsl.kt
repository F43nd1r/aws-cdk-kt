@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
import software.constructs.Construct

public fun Construct.cfnWebACLAssociation(
  id: String,
  props: CfnWebACLAssociationProps,
  initializer: CfnWebACLAssociation.() -> Unit = {},
): CfnWebACLAssociation = CfnWebACLAssociation(this, id, props).apply(initializer)
