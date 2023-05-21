package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@Generated
public
    fun jobBookmarksEncryptionProperty(initializer: CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder.() -> Unit
    = {}): CfnSecurityConfiguration.JobBookmarksEncryptionProperty =
    CfnSecurityConfiguration.JobBookmarksEncryptionProperty.builder().apply(initializer).build()
