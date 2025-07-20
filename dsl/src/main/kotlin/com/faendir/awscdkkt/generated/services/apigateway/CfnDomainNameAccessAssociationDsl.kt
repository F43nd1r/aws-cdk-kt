package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociation
import software.amazon.awscdk.services.apigateway.CfnDomainNameAccessAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainNameAccessAssociation(
  id: String,
  props: CfnDomainNameAccessAssociationProps,
  initializer: @AwsCdkDsl CfnDomainNameAccessAssociation.() -> Unit = {},
): CfnDomainNameAccessAssociation = CfnDomainNameAccessAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainNameAccessAssociation(id: String, initializer: @AwsCdkDsl CfnDomainNameAccessAssociation.Builder.() -> Unit = {}): CfnDomainNameAccessAssociation = CfnDomainNameAccessAssociation.Builder.create(this, id).apply(initializer).build()
