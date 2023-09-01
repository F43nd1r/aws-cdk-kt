package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnDomainNameApiAssociation.() -> Unit = {},
): CfnDomainNameApiAssociation = CfnDomainNameApiAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainNameApiAssociation(id: String, initializer: @AwsCdkDsl
    CfnDomainNameApiAssociation.Builder.() -> Unit = {}): CfnDomainNameApiAssociation =
    CfnDomainNameApiAssociation.Builder.create(this, id).apply(initializer).build()
