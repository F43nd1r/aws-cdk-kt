package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceActionAssociation(
  id: String,
  props: CfnServiceActionAssociationProps,
  initializer: @AwsCdkDsl CfnServiceActionAssociation.() -> Unit = {},
): CfnServiceActionAssociation = CfnServiceActionAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceActionAssociation(id: String, initializer: @AwsCdkDsl CfnServiceActionAssociation.Builder.() -> Unit = {}): CfnServiceActionAssociation = CfnServiceActionAssociation.Builder.create(this, id).apply(initializer).build()
