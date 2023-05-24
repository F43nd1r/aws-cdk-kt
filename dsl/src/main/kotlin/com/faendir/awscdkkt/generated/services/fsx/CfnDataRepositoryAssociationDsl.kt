package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataRepositoryAssociation(id: String,
    props: CfnDataRepositoryAssociationProps): CfnDataRepositoryAssociation =
    CfnDataRepositoryAssociation(this, id, props)

@Generated
public fun Construct.cfnDataRepositoryAssociation(
  id: String,
  props: CfnDataRepositoryAssociationProps,
  initializer: @AwsCdkDsl CfnDataRepositoryAssociation.() -> Unit,
): CfnDataRepositoryAssociation = CfnDataRepositoryAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataRepositoryAssociation(id: String, initializer: @AwsCdkDsl
    CfnDataRepositoryAssociation.Builder.() -> Unit): CfnDataRepositoryAssociation =
    CfnDataRepositoryAssociation.Builder.create(this, id).apply(initializer).build()
