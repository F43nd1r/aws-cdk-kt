@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
