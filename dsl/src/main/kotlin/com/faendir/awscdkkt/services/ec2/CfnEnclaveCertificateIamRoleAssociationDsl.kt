@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
import software.constructs.Construct

public fun Construct.cfnEnclaveCertificateIamRoleAssociation(
  id: String,
  props: CfnEnclaveCertificateIamRoleAssociationProps,
  initializer: CfnEnclaveCertificateIamRoleAssociation.() -> Unit = {},
): CfnEnclaveCertificateIamRoleAssociation = CfnEnclaveCertificateIamRoleAssociation(this, id,
    props).apply(initializer)
