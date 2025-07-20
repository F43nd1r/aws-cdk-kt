package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortfolioPrincipalAssociation(
  id: String,
  props: CfnPortfolioPrincipalAssociationProps,
  initializer: @AwsCdkDsl CfnPortfolioPrincipalAssociation.() -> Unit = {},
): CfnPortfolioPrincipalAssociation = CfnPortfolioPrincipalAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortfolioPrincipalAssociation(id: String, initializer: @AwsCdkDsl CfnPortfolioPrincipalAssociation.Builder.() -> Unit = {}): CfnPortfolioPrincipalAssociation = CfnPortfolioPrincipalAssociation.Builder.create(this, id).apply(initializer).build()
