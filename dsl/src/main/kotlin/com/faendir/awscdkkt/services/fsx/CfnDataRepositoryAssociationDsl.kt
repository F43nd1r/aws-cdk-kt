@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps
import software.constructs.Construct

public fun Construct.cfnDataRepositoryAssociation(
  id: String,
  props: CfnDataRepositoryAssociationProps,
  initializer: CfnDataRepositoryAssociation.() -> Unit = {},
): CfnDataRepositoryAssociation = CfnDataRepositoryAssociation(this, id, props).apply(initializer)
