/*
 * package com.example.validator;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component; import
 * javax.validation.ConstraintValidator; import
 * javax.validation.ConstraintValidatorContext; import
 * com.example.dao.LivreRepository;
 * 
 * 
 * @Component public class UniqueCodeValidator implements
 * ConstraintValidator<codeLivre, String> {
 * 
 * @Autowired LivreRepository livreRepository;
 * 
 * @Override public boolean isValid(String email, ConstraintValidatorContext
 * context) { return !userRepository.existsByEmail(email); } }
 */