package com.faendir.awscdkkt.generated.services.pcaconnectorad

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServicePrincipalName(id: String, initializer: @AwsCdkDsl CfnServicePrincipalName.() -> Unit = {}): CfnServicePrincipalName = CfnServicePrincipalName(this, id).apply(initializer)

@Generated
public fun Construct.cfnServicePrincipalName(
  id: String,
  props: CfnServicePrincipalNameProps,
  initializer: @AwsCdkDsl CfnServicePrincipalName.() -> Unit = {},
): CfnServicePrincipalName = CfnServicePrincipalName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServicePrincipalName(id: String, initializer: @AwsCdkDsl CfnServicePrincipalName.Builder.() -> Unit = {}): CfnServicePrincipalName = CfnServicePrincipalName.Builder.create(this, id).apply(initializer).build()
