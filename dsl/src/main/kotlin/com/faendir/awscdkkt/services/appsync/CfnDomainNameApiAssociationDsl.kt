@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps
import software.constructs.Construct

public fun Construct.cfnDomainNameApiAssociation(
  id: String,
  props: CfnDomainNameApiAssociationProps,
  initializer: CfnDomainNameApiAssociation.() -> Unit = {},
): CfnDomainNameApiAssociation = CfnDomainNameApiAssociation(this, id, props).apply(initializer)
