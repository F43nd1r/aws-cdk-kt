package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterSecurityGroupIngress(id: String,
    props: CfnClusterSecurityGroupIngressProps): CfnClusterSecurityGroupIngress =
    CfnClusterSecurityGroupIngress(this, id, props)

@Generated
public fun Construct.cfnClusterSecurityGroupIngress(
  id: String,
  props: CfnClusterSecurityGroupIngressProps,
  initializer: @AwsCdkDsl CfnClusterSecurityGroupIngress.() -> Unit,
): CfnClusterSecurityGroupIngress = CfnClusterSecurityGroupIngress(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterSecurityGroupIngress(id: String, initializer: @AwsCdkDsl
    CfnClusterSecurityGroupIngress.Builder.() -> Unit): CfnClusterSecurityGroupIngress =
    CfnClusterSecurityGroupIngress.Builder.create(this, id).apply(initializer).build()
