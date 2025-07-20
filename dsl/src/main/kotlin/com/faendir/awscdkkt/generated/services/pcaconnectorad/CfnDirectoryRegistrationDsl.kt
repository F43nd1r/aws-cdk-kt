package com.faendir.awscdkkt.generated.services.pcaconnectorad

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectoryRegistration(
  id: String,
  props: CfnDirectoryRegistrationProps,
  initializer: @AwsCdkDsl CfnDirectoryRegistration.() -> Unit = {},
): CfnDirectoryRegistration = CfnDirectoryRegistration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectoryRegistration(id: String, initializer: @AwsCdkDsl CfnDirectoryRegistration.Builder.() -> Unit = {}): CfnDirectoryRegistration = CfnDirectoryRegistration.Builder.create(this, id).apply(initializer).build()
