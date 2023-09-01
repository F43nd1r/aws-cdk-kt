package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnUser

@Generated
public fun buildSshPublicKeyProperty(initializer: @AwsCdkDsl
    CfnUser.SshPublicKeyProperty.Builder.() -> Unit = {}): CfnUser.SshPublicKeyProperty =
    CfnUser.SshPublicKeyProperty.Builder().apply(initializer).build()
