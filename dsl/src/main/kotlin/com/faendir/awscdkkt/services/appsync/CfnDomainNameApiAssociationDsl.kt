package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainNameApiAssociation(
  id: String,
  props: CfnDomainNameApiAssociationProps,
  initializer: CfnDomainNameApiAssociation.() -> Unit = {},
): CfnDomainNameApiAssociation = CfnDomainNameApiAssociation(this, id, props).apply(initializer)
